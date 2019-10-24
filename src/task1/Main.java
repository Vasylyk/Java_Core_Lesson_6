package task1;

public class Main {
    public static void main(String[] args) {
        WithHourSalary emploee1= new WithHourSalary(50, "Андрій");
        emploee1.salary();
        FixedSalary emploee2 = new FixedSalary("Василь", 8000);
        emploee2.salary();
    }
}
