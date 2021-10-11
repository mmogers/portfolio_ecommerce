package lv.marina.rocketscience;

public class Engine {


    private String name;
    private String fuelType;
    private double fuelConsumption;


    public Engine() {
    }

    public Engine(String name, String fuelType, double fuelConsumption) {
        this.name = name;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
