package desoki.rev1;

public class rev {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Information Systems");
        SalaredEmployee se = new SalaredEmployee("Ahmed", 2000, "Egypt", Gender.MALE, 2000, 500, 50);
        d1.addEmployee(se);
        HourlyEmployee he = new HourlyEmployee("Ahmed", 2100, "Egypt", Gender.MALE, 1200, 6);
        d1.addEmployee(he);
        CommissionEmployee ce = new CommissionEmployee("Ahmed", 2000, "Egypt", Gender.MALE, 5000, 256);
        d1.addEmployee(ce);
        System.out.println(d1.getEmployeeCount());
        d1.printBasicDate();
        d1.printAllDetails();
    }
}
