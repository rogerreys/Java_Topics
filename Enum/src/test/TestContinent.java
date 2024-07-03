package test;

import enumeracion.Continent;

public class TestContinent {
    public static void main(String[] args) {
        System.out.printf(
                "Continent: %s\n" +
                "Countries: %d\n" +
                "Population: %s\n",
                Continent.AFRICA, Continent.AFRICA.getCountries(), Continent.AFRICA.getPopulation()
        );
    }
}
