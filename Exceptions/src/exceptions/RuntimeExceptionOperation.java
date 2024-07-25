package exceptions;

public class RuntimeExceptionOperation extends RuntimeException{
//    RuntimeException no obliga a manejar la exception
    public RuntimeExceptionOperation(String message) {
        super(message);
    }
}
