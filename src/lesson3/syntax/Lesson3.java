package lesson3.syntax;
import lesson1.helloWorldLibrary.WorldLibrary;



public class Lesson3 {

    final String SOME_CONSTANT = "Hello";
    public static void main(String[] args) {

        RocketShip ship = new RocketShip();
        ship.fly(10);

        Bird bird = new Bird();
        bird.fly(5);

        Penguin penguin = new Penguin();
        penguin.fly(10); //penguin is an object

        if(penguin instanceof Penguin){
            System.out.println("Penguin is a penguin");
        }
        if (penguin instanceof Bird){
            System.out.println("Penguin is a Bird");
        }
       /* if(penguin instanceof RocketShip){
            System.out.println("cannot be instance pof Rocketship");
        }*/

        //I want to print my name using Statics
        Statics statics = new Statics("Marina");
        System.out.println(statics.getName());

    }
    public static String boop(){
        return WorldLibrary.getName();
    }
}
enum RocketTypes{
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface{
    //agreement between the user and programmer which methods can be used
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Woosh, I'm flying!");
        return false;
    }
}

class Bird implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, chirp!");
        return false;
    }
}

class Penguin extends  Bird{
    public boolean walk(int speed) {
        return false;
    }

}