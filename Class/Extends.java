package Class;

/**
 * @理解方法调用
 * 弄清楚如何在对象上应用方法调用非常重要。下面假设要调用 x.f(args) 隐式参数 x 声明为类 C 的一个对象。下面是调用过程的详细描述：
 * 1. 编译器査看对象的声明类型和方法名。假设调用 x.f(params) 且隐式参数 x 声明为 C类的对象。需要注意的是：有可能存在多个名字为 f,
 * 但参数类型不一样的方法。例如，可能存在方法 f(int) 和方法 f(String) 编译器将会一一列举所有 C 类中名为 f 的方法和其超类中
 * 访问属性为 public 且名为 f 的方法（超类的私有方法不可访问）。
 * 至此,编译器已获得所有可能被调用的候选方法
 * 2. 接下来，编译器将査看调用方法时提供的参数类型。如果在所有名为 f 的方法中存在一个与提供的参数类型完全匹配，就选择这个方法。
 * 这个过程被称为重载解析（overloading resolution)。例如，对于调用 x.f(“ Hello”）来说， 编译器将会挑选 f(String) 而不是 f(int)
 * 由于允许类型转换 (int 可以转换成 double, Manager 可以转换成 Employee, 等等) 所以这个过程可能很复杂。
 * 如果编译器没有找到与参数类型匹配的方法， 或者发现经过类型转换后 有多个方法与之匹配， 就会报告一个错误。
 * 至此,编译器已获得需要调用的方法名字和参数类型。
 * @注：方法的名字和参数列表称为方法的签名，子类定义相同签名的方法可以覆盖父类方法。返回类型不是签名的一部分。允许子类将覆盖方法的返回类型定义为原返回类型的子类型。
 * eg: public Super methods(){....} public Sub methods() {....}
 * 3. 如果是 private 方法、static 方法、final 方法 构造器方法,那么编译器将可以准确地知道应该调用哪个方法.
 * 这种调用方式称为静态绑定(static binding)。
 * 调用的方法依赖于参数的实际类型 这种为动态绑定。
 * 4 ) 当程序运行，并且采用动态绑定调用方法时，虚拟机一定调用与 x 所引用对象的实际类型最合适的那个类的方法。假设 x 的实际类型是 D，
 * 它是 C 类的子类。如果 D 类定义了方法 f(String) 就直接调用它；否则，将在 D 类的超类中寻找 f(String) 以此类推。
 * 每次调用方法都要进行搜索，时间开销相当大。因此，虚拟机预先为每个类创建了一个
 * 方法表（ method table), 其中列出了所有方法的签名和实际调用的方法。这样一来，在真正
 * 调用方法的时候， 虚拟机仅查找这个表就行了。在前面的例子中， 虚拟机搜索 D 类的方法表，以便寻找与调用 f(Sting) 相匹配的方法。
 * 这个方法既有可能是 D.f(String), 也有可能是X.f(String),
 * 这里的 X 是 D 的超类。这里需要提醒一点，如果调用 super.f(param), 编译器将
 * 对隐式参数超类的方法表进行搜索
 *
 * @example:-manager.setBonus(500)
 * manager声明为Manager类型 根据setBonus的参数类型进行重载解析 确定方法。
 * 由于setBonus不属于静态绑定范畴.所以将采用动态绑定。
 * JVM为Manager 以及 Employee 类生成方法表：
 * Employee：
 *  getName() -> Employee.getName()
 *  getSalary() -> Employee.getSalary()
 *  getHireDay() -> Employee.getHireDay()
 *  raiseSalary(double) -> Employee.raiseSalary(double)
 *  (上面列出的方法并不完整，应包含超类Object方法 此处省略)
 * Manager
 *  getName() -> Employee.getNameO
 *  getSalary() -> Manager.getSalary()
 *  getHireDay() -> Employee.getHireDay()
 *  raiseSalary(double) -> Employee.raiseSalary(double)
 *  setBonus(double) -> Manager.setBonus(double)
 * 方法表稍微有些不同。其中有三个方法是继承而来的，一个方法是重新定义的，还有一个方法是新增加的。
 * @解析过程为:
 * 1 JVM提取manager的实际类型的方法表。既可能是 Employee、Manager 的方法表，也可能是 Employee 类的其他子类的方法表
 * 2 JVM搜索定义 setBonus 签名的类。此时，虚拟机已经知道应该调用哪个方法
 * 3 JVM调用方法
 *
 *
 *
 */
public class Extends  {
    public static void main(String[] args) {
        Manager manager = new Manager("zj", 100.0, 2018, 3, 12);
        manager.setBonus(500);
    }
}
class Manager extends Employee {
    private double bonus;
    public double salary;
    public Manager(String name, double salary, int year, int month, int day) {
//        super关键字 指向父类
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        double salary = super.getSalary();
        this.salary = salary + this.bonus;
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
}