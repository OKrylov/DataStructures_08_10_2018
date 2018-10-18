import java.util.Stack;

public class Lesson3_DZ_Main {
    public static void main(String[] args) {
//        String str = "abcd";
//
//        Stack st = new Stack();
//        for (int i = 0; i < str.length(); i++) {
//            st.push(str.charAt(i));
//        }
//
//        while ( !st.isEmpty() ) {
//            System.out.print(st.pop());
//        }
//
//        if (true)
//            return;

        Deque deq = new DequeImpl(6);
        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);// 1 2 3 4
        deq.insertLeft(5); // 5 1 2 3 4
        deq.insertLeft(6); // 6 5 1 2 3 4

        deq.removeLeft(); //5 1 2 3 4
        deq.removeRight(); // 5 1 2 3
//        displayLeftToRight(deq); // Queue
        displayRightToLeft(deq); //Stack
    }

    private static <T> void displayRightToLeft(Deque deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <T> void displayLeftToRight(Deque deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
