package OOPCA;

public class Country {
    private String name;
    private String capital;
    private int population;
    private int area;
    private City[] cities;
    private String currency;
    private String language;

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language){
        setName(name);
        setCapital(capital);
        setPopulation(population);
        setArea(area);
        setCities(cities);
        setCurrency(currency);
        setLanguage(language);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public void setArea(int area){
        this.area = area;
    }

    public void setCities (City[] cities){
        this.cities = cities;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getName(){
        return name;
    }

    public String getCapital(){
        return capital;
    }

    public int getPopulation(){
        return population;
    }

    public  int getArea(){
        return area;
    }

    public City[] getCities(){
        return cities;
    }

    public String getCurrency(){
        return currency;
    }

    public String getLanguage(){
        return language;
    }

    public City getMostPopulousCity(){
        int totalPopulation=0;
        for(int i=0;i<cities.length;i++) {
            if (cities.length != null)
                totalPopulation++;
        }
        return totalPopulation;
    }

    public void sortCitiesByName(){
        char placeholder;
    }

    public String toString(){
        String str;
        str=("Name  " + getName() + "Capital " + getCapital() + "Population " + getPopulation()+ "Area " + getArea() + "Cities " +getCities() + "Currency " + getCurrency() + "Language " + getLanguage());
        return str;
    }

}
