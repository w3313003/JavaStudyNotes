package Interface;
/**
 * 可以声明接口的变量;且接口变量只能引用实现了接口的类对象：
 * Interface x;
 * 在接口中定义属性的知识点：
 * 1，属性默认的修饰词是：public static final
 * 2，定义的时候必须初始化。
 * 3，在接口中定义的属性 等同于 常量，接口中不允许定义变量
 * 4, default修饰符表示默认方法，实现类中可以重新定义同名方法以覆盖默认方法
 * @解决默认方法冲突
 * 1 ) 超类优先。如果超类提供了一个具体方法，同名而且有相同参数类型的默认方法会被忽略。
 * 2 ) 接口冲突。 如果一个超接口提供了个默认方法，另个接口提供了个同名而且参数类型（不论是否是默认参数）相同的方法，
 * 实现类必须覆盖这个方法来解决冲突。
 * eg: return Super.super.getName();
 * 3 )一个类扩展了一个超类，同时实现了一个接口，并从超类和接口继承了相同的方法。则只会考虑超类方法，接口的所有默认方法都会被忽略
 * 类优先原则
 */

import java.util.Arrays;

public class Index {
    public static void main(String... args){
        Car x = new Car("zj");
        Car x1 = new Car("hym");
        Car[] arr = new Car[20];
        for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] = new Car();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(new Car().test());
    }
    
}

interface Test {
    String name = "213";
    default int test() {
        return 123;
    }
}

class Super {
    public static int count = 0;
    public Super() {
        Super.count++;
    }
    public int test() {
        return 789;
    }
}
class Car extends Super implements Comparable<Car>, Test {
    public String name;
    public int age;
    public Car() {
        this.age = super.count;
    }
    public Car(String name) {
        this.name = name;
        this.age = super.count;
    }
    //      实现Comparable接口的compareTo方法 如果调用Arrays.sort 则类必须实现compareTo方法
    @Override
    public int compareTo(Car o) {
//        类型强转 if params = (Object o) -> Car c = (Car) o;
        return Integer.compare(this.age, o.age);
    }
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.age != other.age) return false;
        return true;
    }
    
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.age;
        return result;
    }
    
    protected boolean canEqual(Object other) {
        return other instanceof Car;
    }
    
    public String toString() {
        return "Car(name=" + this.name + ", age=" + this.age + ")";
    }
}

