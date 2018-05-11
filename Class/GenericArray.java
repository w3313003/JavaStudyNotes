package Class;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ArrayList API
 * void ensureCapacity(int capacity) 分配存储容量
 * int size() 返回长度
 * void trimToSize() 将数组列表的存储容量削减到当前长度。
 * T get(i) 返回指定索引的元素
 * void set(int i, T value) 设置指定索引的值
 * void add(E value) 添加元素
 * void add(int index, T value) 插入元素 原元素后移
 * T remove(int index) 删除个元素，并将后面的元素向前移动。被删除的元素由返回值返回。
 * T[] toArray(T[] arr) 讲ArrayList转换为数组 存储在arr中 并返回填充完成的arr。
 */
public class GenericArray {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>(100);
        Student student = new Student("zj");
        arr.add(123.2);
        arr.add(0, 21312.21);
        for(Double i: arr) {
            System.out.println(i);
        }
        Double[] _arr = new Double[arr.size()];
        arr.toArray(_arr);
        try {
            System.out.println(Arrays.toString(_arr));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(arr.get(0));
        }
        System.out.println(GenericArray.test(1, 1.2,1.2));
    }
//    不定参方法。 Type... value 会转为数组
    public static double test(int a, double... value) {
        double result = 0;
        for(double i: value) {
            result += i;
        }
        return a + result;
    }
}
