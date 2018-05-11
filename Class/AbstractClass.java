package Class;

import java.util.Objects;

/**
 * 类即使不含抽象方法，也可以将类声明为抽象类。
 * 抽象类不能被实例化。
 */
public class AbstractClass {
    public static void main(String[] args) {
        Person[] person = new Person[2];
        person[0] = new Student("zj");
        person[1] = new Worker("hym");
        for(Person p: person){
            System.out.println(p.getDescription());
        }
    }
}
abstract class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public abstract String getDescription();
}
class Student extends Person {
    private String name;
    public String major = "3";
    public Student(String name) {
        super(name);
        this.name = name;
    }
    public String getDescription() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        Student other = (Student) obj;
        return  other != null && getClass() == other.getClass() && name == other.name && major == other.major;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name) * 7;
    }
}

class Worker extends Person {
    private String name;
    public Worker(String name) {
        super(name);
        this.name = name;
    }
    public String getDescription() {
        return this.name;
    }
}
