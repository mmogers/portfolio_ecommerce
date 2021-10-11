package lv.marina.rocketscience;

import lv.marina.rockwtscience.Rocket;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();

        //NOT TO DO THIS
        Rocket rocket2 = rocket1;
        //static method accessed through class not rocket1,countRockets

        System.out.println("There are so many rockets: " + Rocket.countRockets());

        System.out.println("Name of the rocket : " + rocket1.getName());
        System.out.println("Weight of the rocket : " + rocket1.getWeight());


        rocket1.setName("Starship");
        System.out.println("Name of the rocket : " + rocket1.getName());
        //CHANGING ONE WE CHANGE ANOTHER < BY REFERENCE
        System.out.println("Name of the rocket : " + rocket2.getName());

        System.out.println(rocket1.id);

        renameRocket(rocket1, "MoonRover");
        System.out.println("Name of the rocket : " + rocket1.getName());
        changeTheWeight(rocket1.getWeight(), 1000);
        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());
        //Do like this!! to change the weight
        rocket1.setWeight(1000);

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());

            rocket3.printRocketData();
    }

    /**
     * Renames the rocket
     * Changes the original objct
     *
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName) {
        rocket.setName(newName);
    }

    /**
     * changes weight locally DONT DO LIKE THIS
     *
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight(int weight, int newWeight) {
        weight = newWeight;
        System.out.println("Weight was changed locally to " + weight);

    }

}
