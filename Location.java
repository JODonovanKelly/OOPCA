package OOPCA;

public class Location {
    private double latitude;
    private double longitude;

    Location(double latitude, double longitude){
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String toString(){
        String str=("Latitude " + getLatitude() + "Longitude " + getLongitude());
        return str;
    }
}
