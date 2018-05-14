package Class;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射(Reflection)是Java 程序开发语言的特征之一，它允许运行中的 Java 程序获取自身的信息，并且可以操作类或对象的内部属性。
 * 简而言之，通过反射，我们可以在运行时获得程序或程序集中每一个类型的成员和成员的信息。
 * @重点：是运行时而不是编译时
 * Java反射框架主要提供以下功能：
 * 1.在运行时判断任意一个对象所属的类；
 * 2.在运行时构造任意一个类的对象；
 * 3.在运行时判断任意一个类所具有的成员变量和方法（通过反射甚至可以调用private方法）；
 * 4.在运行时调用任意一个对象的方法
 */

public class Reflective {
    public static void main(String[] args) {
    
    }
    static {
        Reflective.getGenericArray();
    }
    /**
     * 获取Class对象的方式
     * 1. obj.getClass()
     * 2. Class.forName(String className) 需提供一个异常处理器
     * 3. ClassName.class
     */
    public void getDesClass() {
//        1
        Student s = new Student("zj");
        Class<?> cl1 = s.getClass();
//        2
        String className = "Class.Student";
        try {
            Class<?> cl2 = Class.forName(className);
        } catch (Exception e) {
            System.out.println(e);
        }
//        3
        Class<?> cl2 = Student.class;
    }
    /**
     * 通过反射来生成对象主要有两种方式。
     * 1. 使用Class对象的newInstance()方法来创建Class对象对应类的实例。默认构造器
     * 2. 先通过Class对象获取指定的Constructor对象，再调用Constructor对象的newInstance()方法来创建实例。这种方法可以用指定的构造器构造类的实例。
     */
    public static void createObj() {
//        1
        Class<?> s = Student.class;
        try {
//            Class类的newInstance获取的是默认构造器 Constructor类获取的是指定参数类型的构造器
            Object s1 = s.newInstance();
            System.out.println(s1.toString());
        }  catch (Exception e) {
            System.out.println(e);
        }
//        2
        Class<?> s1 = Student.class;
        try {
//            getConstructor参数 获取s1类带String.class参数的构造器
            Constructor<?> c = s1.getConstructor(String.class);
            Object s2 = c.newInstance("zj");
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * @java.lang.Class api
     * getComponentType() 返回数组的Class对象
     * 1.获取某个Class对象的方法集合
     * Method[] getDeclaredMethods() 返回类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
     * Method[] getMethods() 返回类的所有公用（public）方法，包括其继承类的公用方法。
     * Method getMethod(String name, Class<?>... parameterTypes) 返回一个特定的public方法(包括继承的public)，其中第一个参数为方法名称，
     * Method getDeclaredMethod(String name Class<?>... parameterTypes) 返回自身的特定方法.
     * 后面的参数为方法的参数对应Class的对象(eg: String.class, Integer.class)
     * 不定参数eg(String[].class)
     * 2.获取某个Class对象的Field集合
     * Field[] getFields() 返回一个包含Field对象的数组， 这些对象记录了这个类或其超类的公有域。
     * Filed[] getDeclaredFie1ds() 返回类或接口声明的所有Field，包括公共、保护、默认（包）访问和私有Field，但不包括继承的Field.
     * Filed getField(String name) 返回对应name且为public的Field(包括继承)
     * Filed getDeclaredField(String name) 返回自身对应name的Field
     * 3. 获取某个Class对象Constructor集合
     * Constructor[] getConstructors() 返回类的public构造器
     * Constructor[] getDeclaredConstructors() 返回类的所有构造器
     * Constructor getConstructor(Class<?> parameterTypes) 返回对应类型的public构造器
     * Constructor getDeclaredConstructor(Class<?> parameterTypes) 返回对应类型的构造器
     * @java.lang.reflect.Field
     * @java.lang.reflect.Method,
     * @java.lang.reflect.Constructor;
     * Class getDeclaringClass() 返回对应的class对象。
     * String getName() 返冋一个用于描述构造器方法或域名的字符串
     * Class[] getExceptionTypes ( ) (在Constructor和Method类中）返回个用于描述方法抛出的异常类型的 Class 对象数组。
     * Class[] getParameterTypes ( ) (在Constructor和Method类中) 返回一个用于描述参数类型的 Class 对象数组
     * Class getReturnType( ) ( 在 Method 类 中） 返回一个用于描述返H类型的 Class 对象。
     * int getModifiers() 返回一个用于描述构造器、 方法或域的修饰符的整型数值。使用 Modifier 类中的这个方法可以分析这个返回值。
     * @Field
     * Object get(Object obj) 返回 obj 对象中用 Field 对象表示的域值。
     * void set(Object obj, Object newValue ) 用个新值设置 Obj 对象中 Field 对象表示的域。
     * @java.Iang.reflect.AccessibleObject Field, Method, Constructor的祖先类
     * void setAccessible(boolean flag) 为反射对象设置可访问标志。flag 为 true 表明屏蔽 Java 语言的访问检查，使得对象的私有属性也可以被査询和设置
     * static void setAccessible(AccessibleObject[] array, boolean flag) 是一种设置对象数组可访问标志的快捷方法。
     * boolean isAccessible( ) 返回反射对象的可访问标志的值。
     */
    public static void getMethods()  {
        Class s1 = Car.class;
        try {
            Car car = new Car("bmw", "40");
//            触发方法
            Method m = s1.getMethod("setBrands", String.class);
            Object obj = s1.getConstructor(String.class, String.class).newInstance("zj","123");
            m.invoke(obj,"456");
            Method getBrands = s1.getMethod("getBrands");
            System.out.println(getBrands.invoke(obj));
//            获取Field字段
            Class<?> cl = car.getClass();
            Field name = cl.getDeclaredField("name");
//            允许访问private方法。
            name.setAccessible(true);
//            设置 Filed.set(obj, value); get(obj);
            name.set(car, "benz");
//            当类的Field类型为基本类型时 会启用自动装箱与自动拆箱
            Object o = name.get(car);
            System.out.println(o);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void getModifier() {
        try {
            Method o = Car.class.getMethod("hashCode");
            System.out.println(o.isAccessible());
//        获取Car的修饰符
            Method ms = Car.class.getMethod("setBrands", String.class);
            int m = ms.getModifiers();
            System.out.println(m);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
//    通过反射获取动态数组
    public static void  getGenericArray()  {
//        try {
//            Class<?> cls = Class.forName("java.lang.String");
//            Object arr = Array.newInstance(cls, 5);
//            Array.set(arr, 0, "java");
//            Array.set(arr, 1, "javascript");
//            Array.set(arr, 2,"typescript");
//            System.out.println(Array.get(arr,1));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        try {
            Car[] car_arr = new Car[20];
            Car car = new Car("bwn", "20");
            Car car1 = new Car("benz", "49");
            car_arr[0] = car;
            Class Type = car_arr.getClass().getComponentType();
            int length = Array.getLength(car_arr);
            Object newarr = Array.newInstance(Type, length);
            System.arraycopy(car_arr, 0, newarr, 0, length);
            Array.set(newarr, 1, car1);
            System.out.println(Array.get(newarr, 1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// 测试用例
class Test {
    private String name = "zj";
    public int age = 23;
    public Test() {
    }
    private Test(int age) {
        this.age = age;
    }
    public Test(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    private int getAge() {
        return this.age;
    }
    private String getBrands() {
        return "312";
    }
}
class Car extends Test {
    public String brands = "3";
    public int mileage = 2;
    private String name;
    public Car() {
        this.mileage = 2;
    }
    public Car(String name, String brand) {
        this.brands = brand;
        this.name = name;
    }
    private Car(int mileage){
        this.mileage = mileage;
    }
    
    public String getBrands() {
        return this.brands;
    }
    
    public int getMileage() {
        return this.mileage;
    }
    
    public void setBrands(String brands) {
        this.brands = brands;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$brands = this.brands;
        final Object other$brands = other.brands;
        if (this$brands == null ? other$brands != null : !this$brands.equals(other$brands)) return false;
        if (this.mileage != other.mileage) return false;
        return true;
    }
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $brands = this.brands;
        result = result * PRIME + ($brands == null ? 43 : $brands.hashCode());
        result = result * PRIME + this.mileage;
        return result;
    }
    protected boolean canEqual(Object other) {
        return other instanceof Car;
    }
    public String toString() {
        return "Car(brands=" + this.brands + ", mileage=" + this.mileage + ")";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}