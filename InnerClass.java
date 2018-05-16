/**
 * 内部类方法可以访问该类定义所在的作用域中的数据，包括私有的数据
 * 内部类可以对同一个包中的其他类隐藏起来
 * 当想要定义一个回调函数且不想编写大量代码时,使用匿名（anonymous) 内部类比较便捷.
 * @特性
 * 内部类既可以访问自身的数据域，也可以访问创建它的外围类对象的数据域.
 * 内部类中声明的所有静态域都必须是final 。
 * 内部类不能有static方法
 * @内部局部类
 * 局部类不能用public 或private 访问说明符进行声明。它的作用域被限定在声明这个局部类的块中。
 * 局部内部类引用的内部变量必须为实际上的final，不能修改。这点与lambda相同
 * @匿名（且局部）内部类
 * 匿名类最大的特点就是匿名了。。。
 * 可以作为桥接使用其他包中超类的protected方法/域。
 * @静态内部类
 * 使用内部类只是为了把一个类隐藏在另外一个类的内部，并不需要内部类引用外围类对象。
 * 为此，可以将内部类声明为static, 以便取消产生的引用。
 * 不能引用外部类的对象
 */
public class InnerClass {
    public static void main(String... args) {
        InnerClass outer = new InnerClass();
        outer.new Inner().run(); //   或者在非静态上下文中使用this.new Inner()
        outer.anonymousClass();
        double[] arr = new double[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 100 * Math.random();
        }
        InnerClass.Innner p = InnerClass.minmax(arr);
        System.out.println("min" + p.getFirst());
        System.out.println("min" + p.getSecond());
        int sign = 100;
        while (sign > 1) {
            sign--;
            System.out.println((int) Math.floor(Math.random() * (10 - 2 + 1) + 2));
        }

    }
//    内部类
    private String name = "test";
    public class Inner {
        public static final int age = 12;
        public void run() {
            System.out.println(name);//   获取外部引用正式语法 InnerClass.this.name;

        }
    }
    //    匿名内部类.
    public void anonymousClass() {
        new Animals("zj23") {
            void getName() {
                System.out.println(this.name);
            }
        }.getName();
    }
//    局部内部类
    public void qqq() {
        int qq = 123;
        class Innerr {
            public void test() {
                int name = qq;//        qq不能再次赋值 因为内部类引用了它
            }
        }
    }
//    静态内部类
    static class Innner {
        private double first;
        private double second;
        public Innner(double f, double s) {
            this.first = f;
            this.second = s;
        }
        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    public static Innner minmax(double[] list){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for(double v: list) {
            if(min > v) {
                min = v;
            }
            if(max < v) {
                max = v;
            }
        }
        return new Innner(min, max);
    }
}
