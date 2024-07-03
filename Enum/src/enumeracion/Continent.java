package enumeracion;

public enum Continent {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1 billones"),
    ASIA(44, "1.5 billones"),
    AMERICA(34, "0.8 billones"),
    OCEANIA(14, "0.2 billones");

    private final int countries;
    private final String population;

    Continent(int countries, String population) {
        this.countries = countries;
        this.population = population;
    }

    public String getPopulation() {
        return population;
    }

    public int getCountries() {
        return this.countries;
    }
}