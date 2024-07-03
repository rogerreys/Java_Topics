package test;

import enumeracion.Days;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        dayOfWeek(Days.TUESDAY);
    }

    private static void dayOfWeek(Days days){
        switch (days){
            case MONDAY:
                System.out.println("First day of week"); break;
            case TUESDAY:
                System.out.println("Second day of week"); break;
        }
    }
}
