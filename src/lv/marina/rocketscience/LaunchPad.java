package lv.marina.rocketscience;
import java.util.Scanner;


public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are so many rockets: " + Rocket.countRockets());

        //static method accessed through class not rocket1,countRockets
        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Weight of the rocket: " + rocket1.getWeight());


        //NOT TO DO THIS
        Rocket rocket2 = rocket1;


        rocket1.setName("Starship");
        System.out.println("Name of the rocket : " + rocket1.getName());

        //CHANGING ONE WE CHANGE ANOTHER < BY REFERENCE
        System.out.println("Name of the rocket : " + rocket2.getName());

        System.out.println(rocket1.id);


        renameRocket(rocket1, "MoonRover");

        System.out.println("Name of the rocket : " + rocket1.getName());
        System.out.println("Name of the rocket : " + rocket2.getName());

        System.out.println("There are so many rockets: " + rocket1.countRockets());

        changeTheWeight(rocket1.getWeight(), 1000);

        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());

        //Do like this!! to change the weight
        rocket1.setWeight(1000);
        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());
        rocket3.printRocketData();

        rocket3 = null;

        Scanner scanner = new Scanner(System.in);
        System.gc();
        System.out.println("Waiting for rocket to be destroyed");

        Math.pow(2,2);
    }

    /**
     * Renames the Rocket
     * Changes the original object
     * @param rocket
     * @param newName
     */

    private static void renameRocket(Rocket rocket, String newName) {
        rocket.setName(newName);
    }

    /**
     * changes the weight only locally
     * DONT DO LIKE THIS
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight( int weight, int newWeight ){
        weight = newWeight;
        System.out.println("weight was changed locally to: " + weight);
    }

}
