package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @树集
 * 树集是一个有序集合(sorted collection). 可以以任意顺序将元素插入到集合中。
 * 将一个元素添加到树中要比添加到散列表中慢,检查数组或链表中的重复元素相比还是快很多
 * @API
 * T first()
 * T last()
 * 返回最大或最小的元素
 * T higher()
 * T lower()
 * 返回大于value 的最小元素或小于value 的最大元素 没有返回null
 * T ceiling()
 * T floor()
 * 返回大于等于vaiue 的最小元素或小于等于value 的最大元素 没有返回null
 * T pollFirst()
 * T pol1Last
 * 删除并返回这个集中的最大元素或最小元素，这个集为空时返回null
 * Iterator<E> descendingIterator() 返回一个按照递减顺序遍历集中元素的迭代器。
 */
public class TreeSets {
    public static void main(String... args){
        String[] arr = {"A","v", "C", "D"};
//        初始化比较器
        TreeSet<String> tree = new TreeSet<>(new TT());
        for(int i = 0; i < 4 ; i++) {
            tree.add(arr[i]);
        }
        Comparator c = tree.comparator();
        System.out.println(c.getClass());
        tree.higher("d");
        tree.forEach(i -> System.out.println(i));
        System.out.println(Arrays.toString(tree.toArray()));
    }
}

class TT implements Comparator<String> {
    public int compare(String s1, String s2) {
        return -(s1.charAt(0) - s2.charAt(0));
    }
}