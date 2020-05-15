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

        Dog dog2 = new Dog();
        dog2.name = "Yasmina";
        dog2.breed = "Poodle";
        dog2.age = 2;

        Dog dog3 = new Dog();
        dog3.name = "Bo";
        dog3.breed = "Daschund";
        dog3.age = 5;
        
        System.out.println("Dog 1 is a " + dog1.breed + " named " + dog1.name + ". " + dog1.name + " is " + dog1.age + " years old.");
        System.out.println("Dog 2 is a " + dog2.breed + " named " + dog2.name + ". " + dog2.name + " is " + dog2.age + " years old.");
        System.out.println("Dog 3 is a " + dog3.breed + " named " + dog3.name + ". " + dog3.name + " is " + dog3.age + " years old.");
 
    }
}