package lesson7;

import lv.marina.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {


    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip( new Engine(), "Escape Plan", 100);

        // add people already in constructor

        //ArrayList<String> people = new ArrayList<>();
        //people.add("Bezos");
        //people.add("Musk");
        //people.add("Elon");
        //PeopleSpaceShip peopleSpaceShip= new PeopleSpaceShip(new Engine(), "Elon", 100, 3, people);


        PeopleSpaceShip peopleSpaceShip= new PeopleSpaceShip(new Engine(), "Elon", 100, 3, new ArrayList<>());
    //How to send people to space?
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");



        //Add some cargo
        peopleSpaceShip.addCargo();
        //should return int
        peopleSpaceShip.addCargo(200);

//example of overloading of methods
        System.out.println(100);
        System.out.println("String");
        System.out.println(peopleSpaceShip);


        System.out.println(peopleSpaceShip);


        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);

        //prints just cargo added
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

        //UPCASTING
                    //fill
        //DOWNCASTING
                    //fill
    }

    public static void printInfoAboutSpaceShip (SpaceShip spaceShip){
        System.out.println("I have a spaceShip: " + spaceShip);
    }


}
