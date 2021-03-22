package Chapter11;

// that's epic!
public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("(4) Faculty's  no-arg constructor is invoked");
    }
}

class Employee extends Person {
    public Employee(){
        this("(2) invoked Employee's overloaded constrcutor");
        System.out.println("(3) Employee's  no-arg constructor is invoked");
    }
    public Employee(String n){
        System.out.println(n);
    }
}

class Person{
    public Person(){
        System.out.println("(1) person's  no-arg constructor is invoked");
    }
}