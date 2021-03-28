package desoki.rev1;

public class BasePluscommissionEmployee extends CommissionEmployee{
    double base;

    public BasePluscommissionEmployee() {
    }

    public BasePluscommissionEmployee(String name, int SSN, String address, Gender sex, double gross_sales, double commission_rate, double base) {
        super(name, SSN, address, sex, gross_sales, commission_rate);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double earnigs(){
        return base + super.earnigs();
    }

    @Override
    public void dispalyAllDetails() {
       super.dispalyAllDetails();
    }

    @Override
    public void displayEarnings() {
       super.displayEarnings();
    }
}
