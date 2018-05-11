package Class;

/**
 * @枚举类参考链接:https://blog.csdn.net/qq_27093465/article/details/52180865
 */
public class Enum {
    public static void main(String... str) {
        System.out.println(Color.RED);
    }
    public enum Color {
        RED, GREEN, BLANK, YELLOW
    }
    public enum Size {
        SMALL("S"),
        MEDIUM("M"),
        LARGE("L"),
        EXTRA_LARGE("XL");
        private String size;
        Size(String size) {
            this.size = size;
        }
        public String getSize() {
            return size;
        }
    }
}
