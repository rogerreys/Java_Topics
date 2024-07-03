public class TestArgVar {
//    vararg tiene que ser el ultimo metodo
//    Incorrecto: method(int... numbers, String name)
//    Correcto: method(String name, int... numbers)
    public static void main(String[] args) {
        printNumber(56,12,45,7,4);
        severalParams("Roger", 1,2,5,4,8);
    }
    private static void printNumber(int... numbers){
        Integer sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        System.out.printf("value sum %d",sum);
    }
    private static void severalParams(String name, int... numbers){
        System.out.printf("\nWelcome %s!!!\n", name);
        printNumber(numbers);
    }
}
