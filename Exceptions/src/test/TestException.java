package test;

import exceptions.ExceptionOperation;

import static arithmetic.Arithmetic.division;
import static arithmetic.Arithmetic.divisionRnt;

public class TestException {
    public static void main(String[] args) {
        int res = 0;
        int resRnt = 0;

//        resRnt = divisionRnt(10, 0); // No maneja la exceptio, no dara error en el compilador pero si al compilar el codigo

        try {
            res = division(10, 0);
        }catch (ExceptionOperation e){
            System.out.println("Ocurrio un error tipo ExceptionOperation");
            e.printStackTrace(System.out);
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error tipo Exception");
            e.printStackTrace(System.out); // Pila de excepciones
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.printf("result: %d", res);
    }
}
