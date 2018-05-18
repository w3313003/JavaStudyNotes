package Concurrents;

public class Index {
    public static void main(String... args) {
        try {
            int a = 3;
            System.out.println(a);
            Thread.sleep(2000);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
