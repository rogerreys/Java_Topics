package arithmetic;

import exceptions.ExceptionOperation;
import exceptions.RuntimeExceptionOperation;

public class Arithmetic {
    public static int division(int numerado, int denomidaor) throws ExceptionOperation {
        if (denomidaor <= 0) {
            throw new ExceptionOperation("Division entre cero");
        }
        return numerado / denomidaor;
    }
    public static int divisionRnt(int numerado, int denomidaor) {
        if (denomidaor <= 0) {
            throw new RuntimeExceptionOperation("Division entre cero");
        }
        return numerado / denomidaor;
    }
}
