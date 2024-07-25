package test;

import domain.Person;

public class TestJavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pepe");
        person.setLastName("Pipo");
        System.out.println(person);
    }
}
