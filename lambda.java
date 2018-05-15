import java.lang.reflect.Array;
import java.util.*;
import java.util.Timer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * 只有一个抽象方法的接口被称为函数式接口。可以用lambda表达式来替代实现类实例
 *
 */
public class lambda {
    public static void main(String args[]) {
        Integer[] a = new Integer[20];
        for(int i = 0; i <= a.length - 1; i++) {
            a[i] = i;
        }
        ArrayList<Integer> list = new ArrayList(Arrays.asList(a));
//        List<Integer> list =  Arrays.asList(a);
        list.forEach(i -> list.add(i * 3));
        list.removeIf(e -> e % 2 == 0);
        System.out.println(Arrays.toString(list.toArray()));
        Timer timer = new Timer();
        String[] arr = {"1222", "21", "1"};
//        比较器为lambda表达式 实现数组自定义排序 另一种方式将比较器构造为实现了Comparator的类实例。
        Arrays.sort(arr, (String a1, String b) -> a1.length() - b.length());
        System.out.println(Arrays.toString(arr));
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
            
            }
        }, 100);
    }
}
