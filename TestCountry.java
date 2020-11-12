package OOPCA;

import javax.swing.*;

public class TestCountry {
    public static void main(String args[]) {


        City c1 = new City("Cork", 124391, new Location(51.8985, 8.4756));
        City c2 = new City("Galway", 79934, new Location(53.2707, 9.0568));
        City c3 = new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City c4 = new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City c5 = new City("Waterford", 53504, new Location(52.2593, 7.1101));

        City listOfCities[] = new City[5];
        City listOfCities[0] = City c1;
        City listOfCities[1] = City c2;
        City listOfCities[2] = City c3;
        City listOfCities[3] = City c4;
        City listOfCities[4] = City c5;

        Country country = new Country( "Ireland","Dublin",4904000,70273, listOfCities, "euro", "English");

        String details;
        JOptionPane.showMessageDialog(null, "The details for the country created are as follows:\n\nName: "+country , "Country Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
