import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Lesson4DZ {

    public static void main(String[] args) {
        LinkedList list = new SimpleLinkedListImpl();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        displayAll(list);

        System.out.println("-----------");

        ListIterator iterator = (ListIterator) list.iterator();
        iterator.reset();//1! 2 3 4
        iterator.insertAfter(11);//1 11! 2 3 4
        iterator.next();//1 11 2! 3 4
        iterator.remove();//1 11 3! 4
        iterator.insertBefore(0);// 1 11 0! 3 4

        displayAll(list);
    }

    private static void displayAll(LinkedList list) {
        for (Integer value : list) {
            System.out.println(value);
        }

        list.forEach(value -> System.out.println(value));

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("--");
        arr.forEach(value -> System.out.println(value));
        System.out.println("--");
        arr.removeIf(value -> value % 2 != 0);
        arr.forEach(value -> System.out.println(value));
        System.out.println("--");



//        var a = 5;

        list.forEach(System.out::println);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });

        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer value = iterator.next();
//            System.out.println(value);
//        }
    }
}