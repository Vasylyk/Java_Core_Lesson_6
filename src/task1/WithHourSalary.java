package task1;

public class WithHourSalary implements Salary {
    private double salaryPerHour;
    private String name;

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WithHourSalary(double salaryPerHour, String name) {
        this.salaryPerHour = salaryPerHour;
        this.name = name;
    }

    @Override
    public void salary() {
        double salaryPerYear=salaryPerHour*8*365;
        System.out.println(name+" заробляє "+salaryPerYear+" гривень в рік");

    }
}
