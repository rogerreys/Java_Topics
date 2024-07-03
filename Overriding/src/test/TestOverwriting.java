package test;

import domain.Manager;

public class TestOverwriting {
    public static void main(String[] args) {
        Manager m = new Manager("Pepe", 800, "Financy");

        System.out.println(m.getDetail());
    }
}
