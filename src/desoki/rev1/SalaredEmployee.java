package desoki.rev1;

public class SalaredEmployee extends Employee implements Displayable {
    double salary, bouns, deductions;

    public SalaredEmployee() {

    }

    public SalaredEmployee(String name, int SSN, String address, Gender sex, double salary, double bouns, double deductions) {
        super(name, SSN, address, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    @Override
    public double earnigs() {
        return (salary + bouns) - deductions;
    }

    @Override
    public void displayEarnings() {
        System.out.println(earnigs());
    }

    @Override
    public void dispalyAllDetails() {
        System.out.println(super.toString()+"\t" + toString());
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public double getBouns() {
        return bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    @Override
    public String toString() {
        return "SalaredEmployee{" +
                "salary=" + salary +
                ", bouns=" + bouns +
                ", deductions=" + deductions +
                '}';
    }
}
