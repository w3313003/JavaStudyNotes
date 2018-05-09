package BasicDataStructure;

public class BaseData {
	public static void main(String[] args) {
		BaseData data = new BaseData();
		data.FloatData();
	}
	/**
	 * @整型
	 * int      4字节     -2^31 ~ 2 ^31
	 * short    2字节     -32768 ~ 32767
	 * long     8字节     -9 223 372 036 854 775 808 - 9 223 372 036 854 775 807
	 * byte     1字节     -128 ~ 127
	 * Long Short Byte Integer 为包装类
	 * 数值l/L表示长整型
	 * 数值前缀0b/0B表示2进制数 0x->十六进制 0->八进制
	 * Long.valueOf -128 ~ 127间有缓存池
	 * */
	public static void IntData() {
		System.out.println();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}
	/**
	 * @浮点型
	 * double   8字节     +-1.7976931348623157E308(有效位数15位)
	 * float    8字节     +-3.4028235E38(有效位数6-7位)
	 * */
	public void FloatData() {
		System.out.print(Float.MAX_VALUE);
		System.out.print(Double.MAX_VALUE);
	}
	/**
	 * @char类型 ‘’单引号
	 * 表示单个字符以及部分unicode值
	 * \b   退格符     \u0008
	 * \t   制表符     \u0009
	 * \n   换行符     \u000a
	 * \r   回车符     \u000d
	 * \"   双引号     \u0022
	 * \'   单引号     \u0027
	 * \\   反斜杠     \u005c
	 *
	 * unicode
	 * 码点（ code point) 是指与一个编码表中的某个字符对应的代码值。
	 * Unicode 标准中，码点采用十六进制书写，并加上前缀 U+, 例如 U+0041 就是拉丁字母 A 的码点。
	 * Unicode 的码点可以分成 17 个代码级别（ codeplane)。第一个代码级别称为基本的多语言级别,码点从 U+0000 到 U+FFFF, 其中包括经典的 Unicode 代码；
	 * 其余的 16个级别码点从 U+10000 到 U+10FFFF , 其中包括一些辅助字符。
	 * 在 Java 中，char 类型描述了 UTF-16 编码中的一个代码单元。
	 * */
	public void CharData() {
		char a = 'a';
	}
	/**
	 * @boolean
	 * 整型和布尔值不能相互转换
	 */
	public void BooleanData() {
		boolean flag = true;
	}
}
