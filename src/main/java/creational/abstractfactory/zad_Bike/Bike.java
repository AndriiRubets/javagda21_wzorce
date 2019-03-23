package creational.abstractfactory.zad_Bike;

public class Bike {
    private String manufacture;
    private int seats;
    private int gears;
    private BikeType bikeType;

    public Bike(String manufacture, int seats, int gears, BikeType bikeType) {
        this.manufacture = manufacture;
        this.seats = seats;
        this.gears = gears;
        this.bikeType = bikeType;
    }
}
