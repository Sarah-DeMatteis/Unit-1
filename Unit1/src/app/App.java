package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Dog dog1 = new Dog();
        dog1.name = "Rufus";
        dog1.breed = "German Shepherd";
        dog1.age = 7;
        dog1.weight = 63;
        dog1.height = 25;
        dog1.ownerName = "Tasmine";

        Dog dog2 = new Dog();
        dog2.name = "Yasmina";
        dog2.breed = "Standard Poodle";
        dog2.age = 2;
        dog2.weight = 48;
        dog2.height = 16;
        dog2.ownerName = "Robert";

        Dog dog3 = new Dog();
        dog3.name = "Bo";
        dog3.breed = "Dachshund";
        dog3.age = 5;
        dog3.weight = 23;
        dog3.height = 8;
        dog3.ownerName = "Krista";
        
        System.out.println("Dog 1 is a " + dog1.breed + " named " + dog1.name + ". " + dog1.name + " is " + dog1.age + " years old."); 
        System.out.println(dog1.name + " weighs " + dog1.weight + " pounds and is " + dog1.height + " inches tall.");
        System.out.println(dog1.ownerName + " is the owner of " + dog1.name + ".");

        System.out.println("Dog 2 is a " + dog2.breed + " named " + dog2.name + ". " + dog2.name + " is " + dog2.age + " years old. ");
        System.out.println(dog2.name + " weighs " + dog2.weight + " pounds and is " + dog2.height + " inches tall.");
        System.out.println(dog2.ownerName + " is the owner of " + dog2.name + ".");

        System.out.println("Dog 3 is a " + dog3.breed + " named " + dog3.name + ". " + dog3.name + " is " + dog3.age + " years old. ");
        System.out.println(dog3.name + " weighs " + dog3.weight + " pounds and is " + dog3.height + " inches tall.");
        System.out.println(dog3.ownerName + " is the owner of " + dog3.name + ".");

    }
}