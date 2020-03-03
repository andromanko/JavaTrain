import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class SimpleArrayListCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //якобы функции getCapacity нету. А в классе он по умолчанию якобы равен 10
        System.out.println(getCapacity(arrayList));
        arrayList.add(2134);
        System.out.println(getCapacity(arrayList)+" "); System.out.println(        arrayList.toArray().length); //ну, наверное это туповатый метод -)
        Integer[] asd={23,35,347,7354,2,3,1,53,757,47,234,6,56,8,456,8,4568,724,356,3568,45,3,453,5,36,457,3,48,3568,354};
        arrayList.addAll(Arrays.asList(asd));
        System.out.println(getCapacity(arrayList));
        System.out.println(        arrayList.toArray().length); //ну, наверное это туповатый метод -) и он выводит количество элементов а не емкость
    }
    //создаем свой метод getCapacity
    public static int getCapacity (ArrayList<?> al) throws NoSuchFieldException, IllegalAccessException {
        //мы нашли в классе arrayList буфер, в котором хранятся данные - elementData
        Field field = al.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        //мы получили доступ к полю, далее field,get(al) - это что-то запредельное
        //преобразовали его в object[] и посчитали длину!!!  жуть!
        return ((Object[])field.get(al)).length;
    }
}
