package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Collection接口方法
 * Iterator<T> 返回一个用于访问集合中每个元素的迭代器。
 * int size() 返回当前存储在集合中的元素个数
 * boolean isEmpty() 如果集合中没有元素，返回true
 * boolean contains(Object obj)  如果集合中包含了一个与obj 相等的对象，返回true 。
 * boolean containsAl1(Collection<?> other) 如果这个集合包含other 集合中的所有元素，返回true。
 * boolean add(Object element) 将一个元素添加到集合中。如果由于这个调用改变了集合，返回true 。
 * boolean addAl1(Collection<? extends E> other) 将other 集合中的所有元素添加到这个集合。如果由于这个调用改变了集合，返回true
 * boolean remove(Object obj) 从这个集合中删除等于obj的对象。如果有匹配的对象被删除，返回true 。
 * boolean removeAl1(Collection<?> other) 从这个集合中删除other 集合中存在的所有元素。如果由于这个调用改变了集合，返回true
 * default boolean removeof(Predicate<? super E> filter) 从这个集合删除filter返回true的所有元素i。如果由于这个调用改变了集合，则返回true
 * void clear() 删除所有元素
 * boolean retainAl1(Collection<?> other) 删除所有与other 集合中的元素不同的元素。如果由于这个调用改变了集合，返回true
 * Object[]toArray() 返回这个集合的对象数组。
 * <T> T[] toArray(T[] arrayToFi11)
 * 返回这个集合的对象数组。如果arrayToFill足够大，就将集合中的元素填入这个数组中，剩余空间填补null;
 * 否则，分配一个新数组，其成员类型与arrayToFill的成员类型相同，其长度等于集合的大小，并填充集合元素。
 * @具体的集合
 * ArrayList                                    一种可以动态增长和缩减的索引序列
 * LinkedList                                   一种可以在任何位置进行高效地插人和删除操作的有序序列
 * ArrayDeque                                   一种用循环数组实现的双端队列
 * HashSet                                      一种没有重复元素的无序集合
 * TreeSet                                      —种有序集
 * EnumSet                                      一种包含枚举类型值的集
 * LinkedHashSet                                一种可以记住元素插人次序的集
 * PriorityQueue                                一种允许高效删除最小元素的集合
 * HashMap                                      一种存储键/ 值关联的数据结构
 * TreeMap                                      一种键值有序排列的映射表
 * EnumMap                                      一种键值属于枚举类型的映射表
 * LinkedHashMap                                一种可以记住键/ 值项添加次序的映射表
 * WeakHashMap                                  一种其值无用武之地后可以被垃圾回收器回收的映射表
 * IdentityHashMap                              一种用==而不是用equals 比较键值的映射表
 */
public class Index {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 4, 5, 5, 6, 2, 6, 7, 7, 8, 8, 9, 9,9,0};
		ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
		Iterator<Integer> it = list.iterator();
		List lis = Arrays.asList(arr);
		System.out.println(lis.get(2));
		it.forEachRemaining(v -> System.out.println(v));
	}
	public void add(){

	}
}
