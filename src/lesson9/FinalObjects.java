package lesson9;

public class FinalObjects {

    public static void main(String[] args) {
       final Rocket rocket1 = new Rocket(120,200,"Petrol");
        System.out.println(rocket1);

        //cannot re-initilize final object
        //rocket1 = new Rocket(999,999,"None");

        //the values can be changed, but the place in the memory remains the same
        rocket1.setHeight(90);
        System.out.println(rocket1);
    }
}


class Rocket{
    private int weight;
    private int height;
    private String fuelType;


    @Override
    public String toString() {
        return "Rocket{" +
                "weight=" + weight +
                ", height=" + height +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public Rocket() {
    }

    public Rocket(int weight, int height, String fuelType) {
        this.weight = weight;
        this.height = height;
        this.fuelType = fuelType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}