package BasicDataStructure;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {
    public static void main(String[] args) {
//        BigInteger 类实现了任意精度的整数运算 BigDecimal 实现了任意精度的浮点数运算
        BigInteger num = BigInteger.valueOf(100);
        BigDecimal f_num = BigDecimal.valueOf(2.2);
        /**
         * @BigInteger API
         * BigInteger add(BigInteger other) 加法
         * BigInteger subtract(BigInteger other) 减法
         * BigInteger multiply(BigInteger other) 乘法
         * BigInteger divide(BigInteger other) 除法
         * BigInteger mod(BigInteger other) 取余
         * int compareTo(BigInteger other) 与另一个大整数 other 相等返回 0; 大于返回正数 小于返回负数
         * static BigInteger valueOf(1ong x) 返回值等于 x 的大整数。
         * @BigDecimal API
         * BigDecimal add(BigDecimal other)
         * BigDecimal subtract(BigDecimal other)
         * BigDecimal multiply(BigDecimal other)
         * BigDecimal divide(BigDecimal other RoundingMode mode)
         * 要想计算商，必须给出舍入方式(rounding mode). RoundingMode.HALF UP是四舍五入.其他的舍入方式参照api
         * int compareTo(BigDecimal other)
         * static BigDecimal valueOf(1 ong x)
         * static BigDecimal valueOf(1 ong x ,int scale) 返回值为 X 或 x / 10^scale 的一个大实数
         */
    }
}
