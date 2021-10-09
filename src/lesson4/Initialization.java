package lesson4;

public class Initialization {

    public static void main(String[] args) {

      //BAD EXAMPLE
      String boopOrWoop; //pointing to null
      boopOrWoop = boop();

      //GOOD EXAMPLE
        String woopOrBoop = woop(); //no variable without initialization
        //!!!!!!!!!!!!!!!!!!!!when declare - assign to something

    }

    static String boop(){
        return "boop";
    }

    static String woop(){
        return "woop";
    }
}
