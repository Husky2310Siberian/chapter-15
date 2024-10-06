package gr.aueb.cf.ch15.person;

public class Employee extends   Person {

    private double salary;


    public Employee () {
        super();
        salary = 0.0;
    }

//    public Employee(double salary) {
//        this.salary = salary;
//    }

    public Employee(long id, String firstname, String lastname, double salary) {
        super(id, firstname, lastname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("get a salary");
    }

    @Override
    protected void speak() {
        super.speak();
        System.out.println("speaks a lot");
    }
}
