package test;
import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Manager m = new Manager("Pepe", 800, "Financy");
//        System.out.println(m.getDetail());
        Employee e = new Employee("Juan", 1200);
        determine(m);
        System.out.println("-----");
        determine(e);
    }

    public static void determine(Employee employee){
        if(employee instanceof Manager){
            System.out.println("Es tipo Gerente");
            Manager manager = (Manager) employee;
            System.out.println("Manager: "+manager.getDepartment());
        } else if (employee instanceof Employee) {
            System.out.println("Es del tipo Empleado");

        }
        else if  (employee instanceof Object) {
            System.out.println("Es del tipo Object");
        }
    }
}
