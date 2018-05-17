package Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 链表却将每个对象存放在独立的结点中。每个结点还存放着序列中下一个结点的引用。
 * 在Java 程序设计语言中，所有链表实际上都是双向链接的(doubly Linked)—即每个结点还存放着指向前驱结点的引用
 */
public class Linkedlists {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2};
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);

        ListIterator<Integer> it = list.listIterator();
        ListIterator<Integer> it2 = list2.listIterator();
        while (it.hasNext()){
            it.next();
            System.out.println(it.nextIndex());
        }
        while (it2.hasNext()){
            it.add(it2.next());
        }
        System.out.println(list.contains(2));
//        list.forEach(i -> System.out.println(i));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
    }
}
