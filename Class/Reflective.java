package Class;

import java.util.Objects;
import java.util.Random;


public class Reflective {
    public static void main(String[] args) {
        Student s = new Student("zj");
        Random generator = new Random();
        Class cl = s.getClass();
        Class cl1 = generator.getClass();
        String name = cl1.getName();
        System.out.println(Student.class.getName());
        try {
            Class obj = Class.forName("java.util.Random");
            System.out.println(obj.getName());
        } catch (ClassNotFoundException e) {
            System.out.println(2);
        }
    }
    /**
     * 获取Class对象的方式
     * 1. obj.getClass()
     * 2. Class.forName(String className) 需提供一个异常处理器
     * 3. ClassName.class
     */
    public void desClass() {
        Student s = new Student("zj");
        Class cl1 = s.getClass();
        String className = "Class.Student";
        try {
            Class cl2 = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        Class cl2 = Student.class;
    }
}
