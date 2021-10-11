package lv.marina.rockwtscience;

import lv.marina.rocketscience.Engine;

/**
 * Rocket class for building spaceships
 */
public class Rocket {


    private String name = "Initial name";
    private String color;
    private int weight;
    private int height;
    private Engine engine;
    private static int rocketCounter;
    public String id;


    public Rocket() {
        addRocket();
    }


    public static int getRocketCounter() {
return getRocketCounter() ;
    }

   public void printRocketData(){
       System.out.println("Rocket{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", weight=" + weight +
               ", height=" + height +
               ", engine=" + engine +
               ", id='" + id + '\'' +
               '}');

}



    /**
     *
     * @param name
     * @param color
     * @param weight
     * @param height
     * @param engine
     */
    public Rocket(String name, String color, int weight, int height, Engine engine) {
        System.out.println("Original: " + this.name);
        System.out.println("New name : " + name);

        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        addRocket();
    }

    public static  int countRockets(){
        return rocketCounter;
    }

    static void addRocket(){
        rocketCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
