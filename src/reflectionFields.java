import java.lang.reflect.Field;

public class reflectionFields {
    private static final class catFields {
        public String name = "Marcel";
        private int age = 7;
        short ears = 5; //это поле типа package !!!?!??!!
        protected long tail = 30;

//        private static final class catMethods
//        public catMethods() {
//        }
//        public catMethods(int age) {this.age= age;}
//        public catMethods(String name, int age, short ears, long tail) {
//            this.name = name;
//            this.age = age;
//            this.ears = ears;
//            this.tail = tail;
        }

        public static void main(String[] args) {
            //внимание! лайфхак по форматированию выводимых строк:
            String s=(char) 27+"[31m"; //красный
            String s1=(char) 27+"[39m"; //синий
            String s2=(char) 27+"[34m"; //черный
//            если в getClass - то мы получаем инфу о public полях/методах итд
//            если в getDeclaredClass - то обо всех (в т.ч. private)
//            методика работы:
            Class<?> cl = catFields.class;//.getClass()
//            или        нужныйКласс.class;
//            потом x.getFields - получаем массив
//            пробегаем по массиву типа for each - и в каждом элементе можем  field.getType, getName, fieldType.getName
            System.out.println(s2+cl.getClass());
            System.out.println(s+"Public fields:");
            Field[] fields = cl.getFields();
            for (Field field: fields) {
                System.out.println(s1+"\tName: "+s2+field.getName()+s1+"\tType: "+s2+field.getType());
//                System.out.println(s1+"\tType: "+s2+field.getType());
            }
            System.out.println(s+"All modifiers fields:");
            fields = cl.getDeclaredFields();
            for (Field field: fields) {
                System.out.println(s1+"\tName: "+s2+field.getName()+s1+"\tType: "+s2+field.getType());
//                System.out.println();
            }
//            в классе могут быть поля:\
//            public int X
//            private int Y
//            int Z   //это типа Package (!!!)
//            protected F
//
//
//            а можно сделать getConstructors - вытянуть все конструкторы класса! аналогично как с полями
//
//            вот такая хитрожопая конструкция:
//            Class<?>[] paramTypes = new Class<?>[]{
//                    int.class
//            };
////получаем ссылку на конструктор с определенным параметром
//            Constructor<?> ctr = cl.getConstructor(paramtypes)   //cl - наш класс, из которого мы вытягиваем инфу\
//            CatMethods cm = (CatMethods) ctr.newInstance(Integer.valueOf(1));   //окуеть
//            приведение к нашему классу
//
//


        }
}

