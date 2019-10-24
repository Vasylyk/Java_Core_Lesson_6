package task1;

public class FixedSalary implements Salary{
    private String name;
    private double salaryPerMounth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMounth() {
        return salaryPerMounth;
    }

    public void setSalaryPerMounth(double salaryPerMounth) {
        this.salaryPerMounth = salaryPerMounth;
    }

    public FixedSalary(String name, double salaryPerMounth) {
        this.name = name;
        this.salaryPerMounth = salaryPerMounth;
    }

    @Override
    public void salary() {
        double salaryPerYear=salaryPerMounth*12;
        System.out.println(name+" заробляє "+salaryPerYear+" гривень в рік");
    }
}
