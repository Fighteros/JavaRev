package desoki.rev1;

import java.util.ArrayList;

public class Department {
    int dno;
    String dName;
    ArrayList<Employee> emList;

    public Department() {

    }
// default IDE insert
//    public Department(int dno, String dName, ArrayList<Employee> emList) {
//        this.dno = dno;
//        this.dName = dName;
//        this.emList = emList;
//    }

    public Department(int dno, String dName) {
        this.dno = dno;
        this.dName = dName;
        emList = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void addEmployee(Employee e) {
        emList.add(e);
    }

    public void rmEmployee(int e) {
        emList.remove(e);
    }

    public int getEmployeeCount() {
        return emList.size();
    }
    public void printBasicDate(){
        for (int i =0 ;i < emList.size(); i++){
            System.out.println(emList.get(i).getSSN()+" "+emList.get(i).getName()+" "+emList.get(i).getSex());
        }
    }
    public void printAllDetails(){
        for(int i =0; i < emList.size(); i++){
            if(emList.get(i) instanceof SalaredEmployee){
                ((SalaredEmployee) emList.get(i)).dispalyAllDetails();
            }else if(emList.get(i) instanceof HourlyEmployee){
                ((HourlyEmployee)emList.get(i)).dispalyAllDetails();
            }
            else if(emList.get(i) instanceof CommissionEmployee){
                ((CommissionEmployee)emList.get(i)).dispalyAllDetails();
            }
        }
    }

}
