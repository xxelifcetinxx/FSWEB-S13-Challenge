package org.example;
import org.example.Employee;
import org.example.Healthplan;
import org.example.enums.Plan;
import org.example.Company;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Healthplan hp = new Healthplan(1, "Sigorta1", Plan.BASIC);
        System.out.println(hp);

        String[] healths = new String[2];
        Employee emp = new Employee(1, "Alice Smith", "alice@test.com", "1234", healths);
        emp.addHealthPlan(0, hp.getName());
        System.out.println(emp);

        String[] devs = new String[2];
        Company comp = new Company(1, "Acme Corp", 5000, devs);
        comp.addEmployee(0, emp.getFullName());
        System.out.println(comp);
    }
}
