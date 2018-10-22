import javax.swing.plaf.TableHeaderUI;
import java.io.File;

public class Lesson5 {

    public static void main(String[] args) throws InterruptedException {
        int n = 5;
//        countdown(n);

//        while (true) {
//            System.out.println(n--);
//        }

//        System.out.println(factorial(n));


        File rootDir = new File("c:\\Users\\krylo\\Google Диск\\My Library\\");
        viewDir(rootDir, "");
    }

    private static void viewDir(File rootDir, String prefix) {
        if (rootDir.isFile()) {
            System.out.println("File: " + prefix + rootDir.getName());
        }
        else {
            System.out.println("Dir: " + prefix + rootDir.getName());
            for (File file : rootDir.listFiles()) {
                viewDir(file, prefix + "    ");
            }
        }
    }

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    private static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static int countdown(int n) throws InterruptedException {
//        if (n < 0) {
//            return n;
//        }
        System.out.println(n);
//        Thread.sleep(1000);
        return countdown(n - 1);
    }
}
