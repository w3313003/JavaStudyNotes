import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"1", "12", "123"};
        Arrays.sort(strs, new lengthCompare());
        System.out.println(Arrays.toString(strs));
        System.out.println("Hello World!");
    }
    static class lengthCompare implements Comparator<String> {
        public int compare(String a, String b) {
            return -(a.length() - b.length());
        }
    }
}
