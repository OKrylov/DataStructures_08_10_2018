import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Main4LinkedList {

    public static void main(String[] args) {
//        LinkedList list = new SimpleLinkedListImpl();
//        TwoSideLinkedList list = new TwoSideLinkedListImpl();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.addLast(5);
//        list.addLast(6);
//
//
//        list.display();
//
//        System.out.println(list.remove());
//        System.out.println(list.remove(8));
//
//        list.display();
//
//        System.out.println("Find 2: " + list.search(2));
//        System.out.println("Find 9: " + list.search(9));
//
//        System.out.println("out");
//
//        while (!list.isEmpty()) {
//            System.out.println(list.remove());
//        }
//
//        System.out.println("test stack");
//        testStack();
//
//        System.out.println("test queue");
//        testQueue();

        testIterator();
    }

    private static void testIterator() {
        List<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        for (Integer value : linkedList) {
//            linkedList.remove(0);
            System.out.println(value);
        }

        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();

//            iterator.remove();
//            iterator.set(22);
        }

        System.out.println("after iterator");
        for (Integer value : linkedList) {
        }

        linkedList.add(linkedList.remove(0));

//        SimpleLinkedListImpl list = new SimpleLinkedListImpl();
//        for (Link value : list) {
//            System.out.println(value);
//        }

    }

    private static void testStack() {
        Stack stack = new LinkedStackImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.pop();
        stack.pop();

        System.out.println("peek: " + stack.peek());

        System.out.println("display:");
        stack.display();


        System.out.println("display and clear:");
        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }

        System.out.println("stack is empty: " + stack.isEmpty());
    }

    private static void testQueue() {
        Queue queue = new LinkedQueueImpl();
            queue.insert(1);
            queue.insert(2);
            queue.insert(3);
            queue.insert(4);
            queue.insert(5);
            queue.insert(6);

        queue.display();
        System.out.println("remove");
        queue.remove();
        queue.remove();
        queue.display();

        System.out.println("display and clear");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        System.out.println("queue is empty: " + queue.isEmpty());
    }

}
