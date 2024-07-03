package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
//        Clases envolventes de tipos primitivos
//        int - Integer
//        long - Long
//        float - Float
//        double - Double
//        boolean - Boolean
//        byte - Byte
//        char - Character
//        short - Short

//        Autoboxing
        Integer num2 = 10;
        System.out.println(num2.toString());
        System.out.println(num2.doubleValue());

//        Unboxing
        int int3 = num2;
        System.out.println(int3);
    }
}
