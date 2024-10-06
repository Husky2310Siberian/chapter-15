package gr.aueb.cf.ch15.person;

public class Main {

    public static void main(String[] args) {



    Employee alice = new Employee(1,"Alice","W.", 20.000);

        System.out.println(alice.getSalary());
        System.out.println(alice.getFirstname());

        alice.speak();
        alice.speak();
}
}