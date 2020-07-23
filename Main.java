import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] qwert = {"asdf","sdf","rrrrr"};
        swap(qwert,1,2);
        convert(qwert);
        for(String o : qwert)
            System.out.println(o);

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box box1 = new Box(apple.addfruit());
        box1.addFruit(apple.addfruit());
        System.out.println(box1.getWeight());
    }

    public static<T> void swap(T[] array, int index1, int index2) {
        T a = array[index1];
        array[index1]=array[index2];
        array[index2]=a;
    }

    public static<T> ArrayList<T> convert(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
