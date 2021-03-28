package desoki.rev1;

public class HourlyEmployee extends Employee implements Displayable {
    private double hour_rate;
    private int no_of_hours;

    public HourlyEmployee(String name, int SSN, String address, Gender sex, double hour_rate, int no_of_hours) {
        super(name, SSN, address, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    @Override
    public double earnigs() {
        return no_of_hours * hour_rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hour_rate=" + hour_rate +
                ", no_of_hours=" + no_of_hours +
                '}';
    }

    @Override
    public void dispalyAllDetails() {
        System.out.println(super.toString() + "\t" + toString());
    }

    @Override
    public void displayEarnings() {
        System.out.println(earnigs());
    }
}
