import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class MainDZ {

    private static final int ARRAY_CAPACITY = 10_000;

    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {
        Array arr = new SortedArrayImpl(ARRAY_CAPACITY);
//        Array arr = new ArrayImpl(ARRAY_CAPACITY);

        randomInitialize(arr);

        Array copy1 = arr.copy();
        Array copy2 = arr.copy();
        Array copy3 = arr.copy();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        ArrayUtils.sortBubble(copy1.getData());
//        ArrayUtils.sortSelect(copy2.getData());
//        ArrayUtils.sortInsert(copy3.getData());

        List<Callable<Void>> tasks = List.of(
                measureTime(() -> ArrayUtils.sortBubble(copy1.getData()), "Sort Bubble"),
                measureTime(() -> ArrayUtils.sortSelect(copy2.getData()), "Sort Select"),
                measureTime(() -> ArrayUtils.sortInsert(copy3.getData()), "Sort Insert")
        );

//        Arrays.sort();

        for (Future<Void> future : executorService.invokeAll(tasks)) {
            future.get(1, TimeUnit.MINUTES);
        }

        executorService.shutdown();
    }

    private static void randomInitialize(Array arr) {
        Random random = new Random();

        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            arr.add(random.nextInt());
        }
    }

    private static Callable<Void> measureTime(Runnable action, String actionName) {
        return () -> {
            long startTime = System.nanoTime();
            action.run();
            long finishTime = System.nanoTime();
            long duration = finishTime - startTime;

            System.out.println(String.format("%s took time: %d ms.",
                    actionName,
                    TimeUnit.NANOSECONDS.toMillis(duration)));

            return null;
        };

    }

}