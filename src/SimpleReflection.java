public class SimpleReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1) способ получения классса - через getClass

        SimpleReflection simpleReflection = new SimpleReflection();
        Class<?> cl = simpleReflection.getClass();
        int arr[] = new int[10];
        Class<?> cl2 = arr.getClass();
        Class<?> cl3 = "HWrld".getClass();
        Class<?> cl4 = Integer.valueOf(5).getClass();
        // 2) способ получения классса - через .Class
        Class<?> cl = SimpleReflection.class;
        Class<?> cl2 = int[].class;
        // 3) способ получения классса - через forName
        Class<?> cl = Class.forName("java.lang.String");   //добавили в сигнатуру - throws ClassNotFoundException
        Class<?> cl2 = Class.forName("[I"); //это типа класс массива!!!
        // 4) с помощью рефлексии


    }
}
