/**
 * 提供clone方法的类必须实现Cloneable接口 提供clone方法
 * clone方法是定义在Object类中的保护方法 需要覆盖此方法。
 */

public class cloneable {
    public static void main(String str[]) {
        Animals cat = new Animals("cat");
        Animals other = cat.clone();
        other.setName("dog");
        System.out.println(cat.name);
    }
}
class Animals implements Cloneable  {
    public String name;
    public Animals(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Animals clone()  {
        try {
            Animals cloned = (Animals) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return this;
        }
    }
}
