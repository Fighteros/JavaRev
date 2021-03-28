package desoki.rev1;

enum Gender {MALE, FEMALE}

public abstract class Employee {
    String name;
    int SSN;
    String address;
    Gender Sex;

    public Employee() {

    }

    public Employee(String name, int SSN, String address, Gender sex) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        Sex = sex;
    }
    public abstract double earnigs();

    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }

    public Gender getSex() {
        return Sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(Gender sex) {
        Sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", SSN=" + SSN +
                ", address='" + address + '\'' +
                ", Sex=" + Sex +
                '}';
    }
}
