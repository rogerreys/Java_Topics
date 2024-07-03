package domain;

public class Person {
    private final int id;
    private static int PersonsCount;

    static {
        System.out.println("Block static executed");
        ++Person.PersonsCount;
    }
    {
        System.out.println("Block NO static executed");
        this.id = Person.PersonsCount++;
    }
    public Person(){
        System.out.println("Constructor executed");
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
