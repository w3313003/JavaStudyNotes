package Class;

/**
 * 依赖("use - a")
 * 聚合("has - a")
 * 继承("is - a")
 */
public class index {
	public static void main (String[] args) {
        Base s1 = new Base("zj");
		s1.run();
		Manager m = new Manager("zj", 10000, 2018, 03, 12);
		System.out.println(m.getId());

	}
	public static void rasie(int[] x) {
		x[0] = x[0] * 3;
	}
	
}
