package lesson3.syntax;

import org.w3c.dom.ls.LSOutput;

public class Statics {

    public Statics(String name){
        this.name = name;
    }
    public Statics(){

    }
    private String name = "Marina";
    private static String surname = "Mogers";






    public String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Statics.surname = surname;
    }
}
 class Animal{
    private String name;
    private String voice ;
    private static int number;//how many animal are in total

     static {
         System.out.println("Class Animal is loaded");
     }

     public Animal(){
         number ++;
         System.out.println("Another anuimal created Total : " + getNumber());
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getVoice() {
         return voice;
     }

     public void setVoice(String voice) {
         this.voice = voice;
     }

     public static int getNumber() {
         return number;
     }

     public static void setNumber(int number) {
         Animal.number = number;
     }
 }

 class Runn{
    public static void main(String[] args){
        Animal dog = new Animal();
        Animal cat = new Animal();
    }
 }