import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
//        int[] array = new int[5];
////        Object[] arr = new Object[3];
////        arr[0] = "str";
////        arr[1] = 1;
////        arr[2] = true;
//
//        Object[] arr = new Object[] {"str", 1, true};
//
//        for (Object value : arr) {
//            System.out.println(value);
//        }
//
//        int[] a = new int[3];
//        Integer[] b = new Integer[3];
//
////        b[3] = 4;//[0..2] size - 1 = 3 - 1 = 2
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

        int[] arrInt = {1, 3, 2 ,4};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        System.out.println("---");
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        //{1, 2, 3, 4}
        //{1, 2, 4} -> {1, 2, -1, 4} -> {1, 2, 4, -1}
        //int size = 0 | {0, 0, 0, 0, 0}
        //size = 1 | {1, 0, 0, 0, 0}
        //size = 2 | {1, 2, 0, 0, 0}
        //size = 3 | {1, 2, 3, 0, 0}
        //size = 2 | {1, 3, 0, 0, 0}
        //for (int i = 0; i < size; i++) {sout(arr[i])}
        //size = 5 | {1, 2, 3, 4, 5} | {1, 2, 3, 4, 5, 0, 0, 0, 0, 0}

        //



    }
}
