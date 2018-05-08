/**
 * @keyword：'strictfp';
 * 使用严格浮点计算:
 * public static strictfp void main
 **/
public class OperatorAndMath {
	/**
	 * @important数值间的转换
	 * 如果两个操作数中有一个是 double 类型， 另一个操作数就会转换为 double 类型。
	 * 否则，如果其中一个操作数是 float 类型，另一个操作数将会转换为 float 类型。
	 * 否则， 如果其中一个操作数是 long 类型， 另一个操作数将会转换为 long 类型。
	 * 否则， 两个操作数都将被转换为 int 类型。
	 */
	public static void main(String[] args) {
		// Math.floorMod 解决负数取余问题
		int a = -3;
		System.out.println(Math.floorMod(a, 2));
		OperatorAndMath op = new OperatorAndMath();
	}
	public void MathApi() {
		/**
		 * @Math类常用api
		 * ceil() : 向上取整。 返回double类型的值。
		 * floor() : 向下取整。  返回double类型的值。
		 * round() : 四舍五入 该方法为重载方法 params(double)->long, params(float)->int;
		 * max() : 返回最大值 返回值根据数值转换规律决定。
		 * min() : 返回最小值。同上
		 * pow(double a, double b) : 求第一个参数的第二个参数次幂。返回double类型的值。
		 * random() : 返回一个 [0,1) 的随机double。 eg ： 获取一个30~50之间的随机整数 Int i = (int)(Math.random*21 +30);
		 * abs()：返回参数类型的绝对值
		 * sqrt(): 返回double类型平方根
		 * @Math类常量
		 * E 自然底数 (double) 2.7182818284590452354
		 * PI π (double) 3.14159265358979323846
		 */
	}
	public void BitOperator() {
		/**
		 * @位运算符(以位(bit)为单位) 二进制
		 * &("and") 逻辑与:仅当两个操作数都为1时。输出结果为1 否则为0 eg:12二进制为1100 5二进制为0101 12 & 5 = 0100 = 4;
		 * |("or") 逻辑或:仅当两个操作数都为0时，输出结果为0。否则为1. eg: 12 | 5 = 1101 = 13
		 * ^("xor") 逻辑异或:仅当两个操作数不同时。输出结果为1，否则为0. eg: 12 ^ 5 = 1001 = 9;
		 * ~("not") 逻辑非(取反) 转为完整2进制(32位后取反) ~12 = -13;
		 * << 左移操作符 把一个数的全部位数都向左移动若干位 eg: 12 << 1 的二进制为 11000  12 << 1 = 24;
		 * >> 右移操作符 把一个数的全部位数都向右移动若干位 eg: 12 << 1 的二进制为 0110 12 >> 1 = 6;
		 * >>> 无符号右移 无符号右移一位。不足的补0 eg: 12 的二进制为 1100  则 12 >> >1 的二进制为 0110， 则完整的运算式为 12 >> 1 = 6;
		 */
	}
}
