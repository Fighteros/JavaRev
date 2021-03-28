package desoki.rev1;

public class CommissionEmployee extends Employee implements Displayable {
    private double gross_sales;
    private double commission_rate;

    public CommissionEmployee(){

    }
    public CommissionEmployee(String name, int SSN, String address, Gender sex, double gross_sales, double commission_rate) {
        super(name, SSN, address, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    @Override
    public void dispalyAllDetails() {
        System.out.println(super.toString() + "\t" + toString());
    }

    @Override
    public void displayEarnings() {
        System.out.println(earnigs());
    }

    @Override
    public double earnigs() {
        return gross_sales * commission_rate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "gross_sales=" + gross_sales +
                ", commission_rate=" + commission_rate +
                '}';
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
}
