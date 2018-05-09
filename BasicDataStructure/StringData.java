package BasicDataStructure;
/**
 * @String API
 * int length() 返回字符串长度
 * String trim() 返回一个新字符串这个字符串将删除了原始字符串头部和尾部的空格
 * String join(CharSequence delimiter, CharSequence ... elements) 返回一个新字符串， 用给定的定界符连接所有元素。
 * int codePointCount(int startIndex , int endIndex) 返回 startIndex 和 endIndex之间的代码点数量没有配成对的代用字符将计入代码点
 * char charAt(int index) 返回给定位置的代码单元
 * String replace(CharSequence oldString ,CharSequence newString) 返回一个新字符串. 可以用String或StringBuilder对象作为CharSequence参数
 * int codePointAt(int index) 返回从给定位置开始的码点。
 * int offsetByCodePoints(int startIndex, int cpCount) 返回从 startIndex 代码点开始，位移 cpCount 后的码点索引。
 * int compareTo(String other) 按照字典顺序，如果字符串位于 other 之前， 返回一个负数；如果字符串位于 other 之后，返回一个正数；如果两个字符串相等，返回 0。
 * IntStream codePoints() 将这个字符串的码点作为一个流返回。调用 toArray 将它们放在一个数组中。
 * new String(int[] codePoints int offset, int count) 用数组中从 offset 开始的 count 个码点构造一个字符串。
 * boolean equals(Object other) 如果字符串与 other 相等 返回 true
 * boolean equalsIgnoreCase(String other) 如果字符串与 other 相等(忽略大小写) 返回 true
 * ---- boolean startsWith(String prefix)
 * ---- boolean endsWith(String suffix)
 * ---- 如果字符串以 suffix 开头或结尾， 则返回 true。
 * int indexOf(String str)
 * int indexOf(String str, int fromIndex)
 * int indexOf(int cp)
 * int indexOf(int cp ,int fromIndex)
 * 返回与字符串 str 或代码点 cp 匹配的第一个子串的开始位置。这个位置从索引 0 或fromIndex 开始计算 否则返回 -1;
 * int lastIndexOf() 同上 反向
 * ---- String substring(int beginIndex )
 * ---- String substring(int beginIndex, int endIndex )
 * ---- 返回一个新字符串。这个字符串包含原始字符串中从 beginIndex 到串尾或 endIndex - 1的所有代码单元。
 * String toLowerCase()
 * String toUpperCase()
 * 大小写转换
 */

public class StringData {
    public static void main(String[] args) {
        String str = "hello,world";
        String str_join = String.join("/", str, str);
        String sub = str.substring(0);
        System.out.println(sub.equalsIgnoreCase(sub));
        /**
         * @比较字符串是否相等的几种方式
         * 1. if(str == "hello,world");
         * 2. if(str.compareTo("hello,world") == 0);
         * 3. if(str.equals("hello,world"));
         */
        StringData obj = new StringData();
        obj.builder();
    }
    /**
     *@Description:构建字符串
     *@params: []
     *@return: void
     *@Author: ZJ
     *Date: 2018/5/9
     **/
    public static void builder() {
        /**
         * StringBuffer与StringBuilder API相同
         * StringBuffer是线程安全的
         * @API
         * int length() 返回构建器或缓冲器中的代码单元数量
         * StringBui1der append(String str / char c) 追加一个字符串并返回 this。
         * StringBui1der appendCodePoint(int cp) 追加一个代码点，并将其转换为一个或两个代码单元并返回 this。
         * void setCharAt(int i ,char c)  将第 i 个代码单元设置为 c。
         * StringBui1der insert(int offset, String str / Char c ) 在 offset 位置插入一个字符串并返回 this。
         * StringBui1der delete(1 nt startIndex, int endIndex) 删除偏移量从 startindex 到 -endlndex-1 的代码单元并返回 this。
         * String toString() 返回一个与构建器或缓冲器内容相同的字符串
         */
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append(",world");
        System.out.println(builder.length());
    }
    /**
     *@Description:反转字符串
     *@params: [str]
     *@return: java.lang.String
     *@Author: ZJ
     *Date: 2018/5/9
     **/
    public static String reverseStr (String str){
//          method 1
//          return new StringBuilder(str).reverse().toString();

//          method 2
        StringBuilder builder = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            builder.append(ch);
        }
        return builder.toString();
    }
}
