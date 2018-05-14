package BasicDataStructure;

import java.util.Arrays;

public class studyArray {
	public static void main(String[] args) {
//		创建一个数字数组时所有元素都初始化为0,boolean 数组的元素会初始化为 false 对象数组则初始化位null;
		int[] arr = new int[100];
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
//		foreach
		for(int i: arr){
			result += i;
		};
		System.out.println(result);
		System.out.println(Arrays.toString(arr));
//      数组初始化
		int[] _arr = { 1, 2, 3};
//	    匿名数组
		_arr = new int[] { 17, 19, 23, 29, 31, 37 };
//		数组拷贝 Arrays类的copyOf方法(source, length)
		int[] newArr = Arrays.copyOf(_arr, 20);
//		命令行参数 main()的参数 eg: java Array -g t1 t2 -> arr[0] == -g arr[1] == t1
		/**
		 * @java.util.Arrays 工具类常用APi
		 * static String toString(type[] a) 返回包含 a 中数据元素的字符串， 这些数据元素被放在括号内， 并用逗号分隔。
		 * static type copyOf(type[]a ,int length)
		 * static type copyOfRange(type[]a , int start, int end)
		 * 返回与 a 类型相同的一个数组,其长度为 length 或者 end-start 数组元素为a的值
		 * static void sort(type[] a) 采用优化的快速排序算法对数组进行排序。
		 * static int binarySearch(type[] a ,type v).
		 * static int binarySearch(type[]a, int start, int end, type v).
		 * 采用二分搜索算法查找值 v。如果查找成功， 则返回相应的下标值； 否则， 返回一个负数值 。r -r-1 是为保持 a 有序 v 应插入的位置。
		 * static void fi11(type[]a , type v) 将数组的所有数据元素值设置为 V。
		 * static boolean equals(type[]a, type[]b) 如果两个数组大小相同并且下标相同的元素都对应相等返回 true
		 */
		System.out.println(Arrays.binarySearch(_arr, 2,6, 23));

	}
}
