package Class;

public class Extends  {

}
class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public int getId() {
        return this.id;
    }
}