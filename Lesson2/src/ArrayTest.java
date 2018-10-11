import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArrayTest {

    public static void main(String[] args) {
//        Array array = new ArrayImpl(5);
        Array array = new SortedArrayImpl(5);
        array.display();
        System.out.println(array.add(3));
        System.out.println(array.add(2));
        System.out.println(array.add(4));
        array.display();
        System.out.println(array.add(5));
        System.out.println(array.add(1));
        System.out.println(array.add(6));

        array.display();



        System.out.println("Find 3: " + array.find(3));
        System.out.println("Find 81: " + array.find(81));

        array.remove(3);
        array.display();
        array.add(6);
        array.display();

        int[] data = {5, 9, 4, 11, 1};

        System.out.println("sorts!");
        System.out.println(Arrays.toString(data));

//        System.out.println("sort bubble");
//        ArrayUtils.sortBubble(data);

//        System.out.println("sort select");
//        ArrayUtils.sortSelect(data);

        System.out.println("sort insert");
        long start = System.nanoTime();
        ArrayUtils.sortInsert(data);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));


        System.out.println(Arrays.toString(data));
    }
}
