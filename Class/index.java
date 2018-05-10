package Class;

import static java.lang.Math.*;

import java.util.Arrays;

/**
 * 依赖("use - a")
 * 聚合("has - a")
 * 继承("is - a")
 */
public class index {
	public static void main (String[] args) {
        Base s1 = new Base("zj");
		s1.run();
		Manager m = new Manager();
		System.out.println(m.getId());

	}
	public static void rasie(int[] x) {
		x[0] = x[0] * 3;
	}

}
