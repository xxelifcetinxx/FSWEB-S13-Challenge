package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runProject();
    }

    public static void runProject() {
        // Healthplan objesi
        Healthplan hp1 = new Healthplan(1, "Sağlık Paketi A", Plan.BASIC);
        System.out.println(hp1);

        // Employee objesi
        String[] plans = new String[2];
        Employee emp1 = new Employee(101, "Ahmet Yılmaz", "ahmet@example.com", "pass123", plans);
        emp1.addHealthplan(0, "BASIC");
        emp1.addHealthplan(1, "VIP");
        emp1.addHealthplan(2, "OUT"); // index out of bounds
        emp1.addHealthplan(0, "PREMIUM"); // already occupied
        System.out.println(emp1);

        // Company objesi
        String[] devs = new String[2];
        Company com1 = new Company(501, "TechCorp", 500000.0, devs);
        com1.addEmployee(0, "Mehmet Developer");
        com1.addEmployee(1, "Ayşe Frontend");
        com1.addEmployee(0, "Deniz UX"); // already occupied
        com1.addEmployee(3, "Ali Backend"); // index out of bounds
        System.out.println(com1);
    }
}
