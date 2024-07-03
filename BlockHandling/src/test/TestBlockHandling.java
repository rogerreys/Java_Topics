package test;

import domain.Person;

public class TestBlockHandling {
    public static void main(String[] args) {
//        El bloque estatico se llama una vez se guarda en memoria, cuando ya se guardo no se vuelve a llamar
//        por ello en la consola muestra lo siguiente
//        Block static executed
//        Block NO static executed
//        Constructor executed
//        Person{id=1}
//        Block NO static executed
//        Constructor executed
//        Person{id=2}

        Person p1 = new Person();
        System.out.println(p1);
        Person p2 = new Person();
        System.out.println(p2);
        Person p3 = new Person();
        System.out.println(p3);
    }
}
