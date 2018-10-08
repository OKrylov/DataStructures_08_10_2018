public class Main {

    private static int b;
    private static char chr;

    private static String staticStr;

    public static void main(String[] args) {
//        primitive();

//        LinkVars();

        int a = 5;
        int b = 4;
        System.out.println("a = "+ a);
        calculate(a, b);
        System.out.println("a = "+ a);

        Person p1 = new Person("Petr", 28);//001

        System.out.println(p1);//001
        rename(p1);//001
        System.out.println(p1);//001
    }

    private static void rename(Person p1) {//001
        p1.name = "Kirill";
//        p1 = new Person("Kirill", 28);//002

        System.out.println(p1);//002
    }

    private static void calculate(int a, int b) {
        a = a + b;
        System.out.println("a = " + a);
    }

    private static void LinkVars() {
        String str = new String("text");//002 (003) //003 ('t' (003), 'e' (004), 'x' (005), 't' (006))
        String str2 = new String("text");//010 (011) ('t' (011), 'e' (012), ...)
        System.out.println("link ==");
        System.out.println(str == str2);

        System.out.println("Equals str & str2 = " + str.equals(str2));


        System.out.println(str);
        System.out.println(staticStr);

        Person p1 = new Person("Petr", 28);
        Person p2 = new Person("Petr", 28);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1 = p2: " + (p1 == p2));
    }

    private static void primitive() {
        int a = 5;//001 (5)
        a = 6;//001 (6)

        System.out.println(a);
        System.out.println(b);
        System.out.println(chr);

        int c = 6;//009 (6)

        System.out.println("primitive ==");
        System.out.println(a == c);
    }
}
