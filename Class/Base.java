package Class;

import java.time.LocalDate;
import java.util.Random;

/**
 * @修饰符------
 * 1 ) 仅对本类可见 private。
 * 2 ) 对所有类可见 public;
 * 3 ) 对本包和所有子类可见 protected。
 * 4 ) 对本包可见 不需要修饰符(default/friendly);
 * @注:如果不在同一个包，则超类的protected只能在子类中使用，子类的实例无法直接访问。可在子类方法中通过super.method代理实现
 * @------
 * static 静态方法/属性 可通过类名直接访问 同时所有实例均共享此属性/方法
 * 对象中的数据称为实例域（ instance field )
 * 操纵数据的过程称为方法（method)
 * 一个类可以有多个constructor实现重载
 * public：可以被所有其他类所访问
 * private：只能被自己访问和修改
 * protected：自身、子类及同一个包中类可以访问
 * default：同一包中的类可以访问，声明时没有加修饰符，认为是friendly。
 * 内部类参考链接: https://www.cnblogs.com/dolphin0520/p/3811445.html
 * 静态方法无法访问实例域 只能获取静态域。
 * 内部类无法定义静态方法。
 * 如果没有初始化类中的域， 将会被自动初始化为默认值（ 0、false 或 null )
 * 如果在编写一个类时没有编写构造器， 那么系统就会提供一个无参数构造器。如果类中提供了至少一个构造器但是没有提供无参数的构造器， 则在构造对象时如果没有提供参数就会被视为不合法
 * 引入其他类的静态域和静态方法 import static path;
 * 当父类方法加上final修饰符时 子类无法定义方法覆盖此方法. final类中的方法全被定义为final方法。
 * @注意：在覆盖一个方法的时候，子类方法不能低于超类方法的可见性。特别是如果超类方法是public,子类方法一定要声明为public。
 */

public class Base {
    public static  int a = 23;
    protected String name;
    /**
     *@Description: "构造函数"
     *@params: [name]
     *@return: void
     *@Author: ZJ
     *Date: 2018/5/10
     **/
    public Base(String name) {
        this.name = name;
    }
    public void run() {
        Employee[] staff = new Employee[3];
        Employee staff1 =  new Manager("zj", 100.0, 2018, 3, 12);
//        或者上述staff1类型改为Manager
        ((Manager) staff1).setBonus(500);
        Employee staff2 = new Employee("hym", 100, 2018, 1, 2);
        Employee staff3 = new Employee("child", 50, 2021, 2, 3);
        staff[0] = staff1;
        staff[1] = staff2;
        staff[2] = staff3;
        for(Employee s: staff){
            s.raiseSalary(50);
            String result = "员工" + s.getName() + "当前薪资为" + s.getSalary();
            System.out.println(result);
        }
        System.out.println(Employee.id);
    }
}
class Employee {
    public static int id = new Random().nextInt(1000);
    //    static 静态域(类域)
    private static int age = 44;
    //           实例域
    private String name;
    private double salary;
    private LocalDate hireDay;
    public static void test() {
        int a = age;
    }
    public Employee factory(String name, double salary, int year, int month, int day) {
        return new Employee(name, salary, year, month, day);
    }
//    无参数构造函数 用于子类继承
    public Employee() {

    }
    public Employee(String name, double salary, int year, int month, int day) {
//        this可以省略 (隐式参数.)name = name; this是指向隐式参数的指针,可复制 不同于super。
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }
    public double raiseSalary(double percent) {
        double raise = this.salary * (percent / 100);
        this.salary += raise;
        return this.salary;
    }
    public  String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    public LocalDate getHireDay() {
        return  this.hireDay;
    }
    public Employee getInstance() {
        return this;
    }
}

