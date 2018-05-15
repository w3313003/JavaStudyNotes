import java.util.Arrays;
import java.util.List;
import java.util.Timer;

public class lambda {
    public static void main(String str[]) {
        Integer[] a = new Integer[20];
        for(int i = 0; i <= a.length - 1; i++) {
            a[i] = i;
        };
        List<Integer> list =  Arrays.asList(a);
        list.forEach(i -> {
            i += 2;
            System.out.println(i);
        });
        System.out.println(Arrays.toString(list.toArray()));
        Timer timer = new Timer();
        String[] arr = {"1222", "21", "1"};
//        比较器为lambad表达式 实现数组自定义排序 另一种方式将比较器构造为实现了Comparator的类实例。
        Arrays.sort(arr, (String a1, String b) -> a1.length() - b.length());
        System.out.println(Arrays.toString(arr));
    }
}
