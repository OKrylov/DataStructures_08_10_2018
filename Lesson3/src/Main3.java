public class Main3 {

    public static void main(String[] args) {
//        testStack();
//        testBrackets();
//        testQueue();
        testPriorityQueue();
    }

    private static void testPriorityQueue() {
        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(30);
        queue.insert(50);
        queue.insert(10);
        queue.insert(40);
        queue.insert(20);

        while ( !queue.isEmpty() ) {
            System.out.println(queue.remove());
        }
    }

    private static void testQueue() {
        Queue queue = new QueueImpl(5);
        addToQueue(queue, 1);
        addToQueue(queue, 2);
        addToQueue(queue, 3);
        addToQueue(queue, 4);
        addToQueue(queue, 5);
        addToQueue(queue, 6);

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

    private static void addToQueue(Queue queue, int value) {
        if (!queue.isFull()) {
            queue.insert(value);
        }
    }

    private static void testBrackets() {
        System.out.println("test bracket:");
        String in = "    public static void main(String[] args) {        testStack();    ";
        new Bracket(in).check();
        System.out.println("finish check bracket");
    }

    private static void testStack() {
        Stack stack = new StackImpl(5);

        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);
        addToStack(stack, 5);
        addToStack(stack, 6);

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

    private static void addToStack(Stack stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
        }
    }
}
