package OOPCA;

public class City {
    private String name;
    private int population;
    private Location location;

    public City(String name, int population, Location location){
        setName(name);
        setPopulation(population);
        setLocation(location);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public Location getLocation() {
        return location;
    }

    public  static int getDistanceBetween(){
        int distance=0;
        distance=110.25/Math.sqrt((((c1-c2)*(c1-c2))+(c1-c2).Cos(c2(latitude))*((c1-c2)*(c1-c2))+(c1-c2).Cos(c2(latitude))));
        return distance;
    }

    public String toString(){
        String str=("Name " + getName() + "Population " + getPopulation() + "Location " + getLocation());
        return str;
    }
}
