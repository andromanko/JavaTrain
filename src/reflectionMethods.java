import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflectionMethods {
    private static class Dog {
        private int Age=3;
    }

    private static final class CatMethods {
        public String name = "Marcel";
        private int age = 7;
        short ears = 5; //это поле типа package !!!?!??!!
        protected long tail = 30;
        public CatMethods() {
        }
        public CatMethods(int age) {
            this.age = age;
        }
        public CatMethods(short ears) {
            this.ears = ears;
        }
        public CatMethods(String name, int age, short ears, long tail) {
            this.name = name;
            this.age = age;
            this.ears = ears;
            this.tail = tail;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        private void setAge(int age) {
            this.age = age;
        }
        public short getEars() {
            return ears;
        }
        public void setEars(short ears) {
            this.ears = ears;
        }
        public long getTail() {
            return tail;
        }
        public void setTail(long tail) {
            this.tail = tail;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        //внимание! лайфхак по форматированию выводимых строк:
        String s = (char) 27 + "[31m"; //красный
        String s1 = (char) 27 + "[39m"; //черный
        String s2 = (char) 27 + "[34m"; //синий
//            если в getClass - то мы получаем инфу о public полях/методах итд
//            если в getDeclaredClass - то обо всех (в т.ч. private)
//            методика работы:
        Class<?> cl = CatMethods.class;//.getClass()
//            или        нужныйКласс.class;
//            потом x.getFields - получаем массив
//            пробегаем по массиву типа for each - и в каждом элементе можем  field.getType, getName, fieldType.getName
        System.out.println(s2 + cl.getClass());
        System.out.println(s + "Public fields:");
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            System.out.println(s1 + "\tName: " + s2 + field.getName() + s1 + "\tType: " + s2 + field.getType());
//                System.out.println(s1+"\tType: "+s2+field.getType());
        }
        System.out.println(s + "All modifiers fields:");
        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(s1 + "\tName: " + s2 + field.getName() + s1 + "\tType: " + s2 + field.getType());
//                System.out.println();
        }
//
//            а можно сделать getConstructors - вытянуть все конструкторы класса! аналогично как с полями
//            вот такая хитрожопая конструкция:
       //cl = catMethods.class;
////получаем ссылку на конструктор с определенным параметром - конструктор без параметров - крайний!
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.println(s + "\tConstructor:" + (++i) + ":");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes
            ) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.println();
        }
        System.out.println(s+"ТУТ ДЕЛАЕТСЯ  содержимого ПОЛЯ!");
        try {
            Class<?>[] paramTypes = new Class<?>[]{  //т.е. создается массив!!!!! paramTypes[]
                    short.class
            }; //обля! вот тут определяется какой тип поля мы будем изменять! (а если их 2?!)
            Constructor<?> ctr = cl.getConstructor(paramTypes);   //cl - наш класс, из которого мы вытягиваем инфу\
            CatMethods cm = (CatMethods) ctr.newInstance(Short.valueOf((short)13));
            //тут обратились к приватному конструктору к //окуеть вот тут переопределяется приватное поле! если бы поставили int - было бы age! -НОВАЯ СУЩНОСТЬ!!!
            System.out.println(s + "Fields:" + s1 + " Age:" + cm.getAge() + ", Name:" + cm.getName()+ ", ears:" + cm.getEars());
            paramTypes = new Class<?>[]{
                    int.class
            }; //обля! вот тут определяется какой тип поля мы будем изменять! (а если их 2?!)
            ctr = cl.getConstructor(paramTypes);   //cl - наш класс, из которого мы вытягиваем инфу\
            cm = (CatMethods) ctr.newInstance(Integer.valueOf((int)130));
           // System.out.println(" AgeBefore:")
            //System.out.println(cm);
//            приведение к нашему классу
            System.out.println(s + "Fields:" + s1 + " Age:" + cm.getAge() + ", Name:" + cm.getName()+ ", ears:" + cm.getEars());
        }
        catch (Exception ex){
            ex.printStackTrace();
           }
        System.out.println(s+"вытаскиваем методы и их параметры");
        Method[] methods = cl.getMethods();
        for (Method method:methods) {
            System.out.println(s1+method.getName()+" "+s2 +method.getReturnType().getName());
            //без getName тоже можно но будет немного по-другому (заметил при выводе имени класса)
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.println(s2+"ParamTypes:");
            for (Class<?> paramtype : paramTypes                 ) {
                System.out.print(" "+paramtype.getName());
            }
            System.out.println();
        }
        System.out.println(s+"методы вытащены");

        try {
            CatMethods cm = new CatMethods();
            Class<?>[] paramTypes = new Class<?>[] { int.class};
            //ссылка на метод setAge и параметром int
            Method method = cl.getDeclaredMethod("setAge", paramTypes);
            //^^^вызываем?! метод с параметром = название метода (типа неизвестное) и параметром int class причем МАССИВ
            //если getMethod = то только public. а в качестве эксперимента я поставил этому методу private (тогда он выводил ошибку)

            Object [] objArgs = new Object[] {Integer.valueOf(888)};
            //invoke =- пар 1 - объект, класс которого объявляет или наследует данный метод
//            пар2 - массив значений параметров, которые передаются методу
            method.invoke(cm, objArgs); //т.е. мы передаем 8-ку каким-то извращенным методом, и массив методов catMethods
            //причем это мы делаем с определенным методом, называемым string "setAge"
            System.out.println(s+"Age:"+s1+cm.getAge()+" ears:"+cm.getEars());



            method = cl.getDeclaredMethod("setEars", short.class); //short class проставился автоматически!!!
            //если getMethod = то только public. а в качестве эксперимента я поставил этому методу private (тогда он выводил ошибку)
            objArgs = new Object[] {Short.valueOf((short)13)};
            //invoke =- пар 1 - объект, класс которого объявляет или наследует данный метод
//            пар2 - массив значений параметров, которые передаются методу
            method.invoke(cm, objArgs); //т.е. мы передаем 8-ку каким-то извращенным методом, и массив методов catMethods
            //причем это мы делаем с определенным методом, называемым string "setAge"
            System.out.println(s+"Age:"+s1+cm.getAge()+" ears:"+cm.getEars());


        }
        catch ( Exception ex) {
            ex.printStackTrace();
        }


        int mods = cl.getModifiers();
        System.out.println(s+"Getting modoficators! for our class "+cl.getName()+"mods:"+mods);
        if (Modifier.isPrivate(mods)) System.out.println(s1+"private");
        if (Modifier.isAbstract(mods)) System.out.println(s1+"Abstract");
        if (Modifier.isStatic(mods)) System.out.println(s1+"StaTic");
        if (Modifier.isFinal(mods)) System.out.println(s1+"FINAL");
        //и т.д. isКТОТО

        System.out.println(s+"меняем содержимое private класса");

        cl = Dog.class; //прочитали информацию о классе
        Dog dog = new Dog(); //создали его объект
        try {
            Field field = cl.getDeclaredField("Age"); //находим поле (одно), моглт бы больше с нашим названием
            field.setAccessible(true); //мы типа опускаемся до самого public уровня доступа!
            System.out.println(s +"Before change:"+ field.getInt(dog));
            field.setInt(dog,65536);
            System.out.println(s +"After change:"+ field.getInt(dog));
            System.out.println(s +"Excellent! We are the champions!");
        }
        catch (Exception ex) {ex.printStackTrace();};
    }
}



