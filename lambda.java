import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.function.BiFunction;

/**
 * 只有一个抽象方法的接口被称为函数式接口。可以用lambda表达式来替代实现类实例
 * @函数式接口
 * 接口名              参数类型            返回类型            抽象方法名           描述                          其他方法
 * Runnable             无                void               run           作为无参数或返回值的动作运行            无
 * Supplier<T>          无                 T                 get             提供一个T类型的值                   无
 * Consumer<T>          T                 void              accept          处理一个T类型的值                   andThen
 * BiConsumer<T,U>      T,U               void              accept         处理一个T和U类型的值                  andThen
 * Function<T,R>        T                   R               apply           有一个T类型参数的函数             Compose,andThen,identity
 * BiFunction<T, U, R>  T,U                 R               apply           有T和U类型参数的函数                 andThen
 * UnaryOperator<T>     T                   T               apply           类型T上的一元操作符               Compose,andThen,identity
 * BinaryOperator<T>   T,T                  T               apply           类型T上的2元操作符                andThen, maxBy, minBy
 * Predicate<T>         T                boolean            test               布尔值函数                    and,or,negate,isEqual
 * Bipredicate<T,U>     T,U              boolean            test           有两个参数的布尔值函数              and，or，negate
 * @方法引用
 * object::instanceMethod
 * Class::staticMethod
 * Class::instanceMethod
 * 前两种方法引用等价于提供方法参数的lambda 表达式前面已经提到
 * eg:System.out::println 等价于x-> System.out.println(x)
 * Math::pow 等价于（x，y)->Math.pow(x, y).
 * 对于第3种情况，第1个参数会成为方法的目标 eg:String::compareToIgnoreCase 等同于(x, y)-> x.compareToIgnoreCase(y);
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
        list.forEach(i -> System.out.println(list.get(i)));
        list.removeIf(e -> e % 2 == 0);
        System.out.println(Arrays.toString(list.toArray()));
        Timer timer = new Timer();
        String[] arr = {"1222", "21", "1"};
//        比较器为lambda表达式 实现数组自定义排序 另一种方式将比较器构造为实现了Comparator的类实例。
        Arrays.sort(arr,(String first, String second) -> first.length() - second.length());
//        方法引用 Class::instanceMethod。可使用String::compareTo替代下文的lambda;
//        Arrays.sort(arr, (String str, String str2) -> str.compareTo(str2));
        System.out.println(Arrays.toString(arr));
        BiFunction<String, String, Integer> f = (String s, String s2) -> 2;
        int num = 2;
        repeat(10, i -> System.out.println("Comsumer" + (9 - i)));
    }
    public static void repeat(int n, IntComsumer action) {
        for(int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}
interface IntComsumer {
    void accept(int value);
}