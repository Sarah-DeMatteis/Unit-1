package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name.");
        String name1 = input.nextLine();
        
        System.out.println("Please enter a noun.");     
        String noun1 = input.nextLine();

        System.out.println("Please enter an adjective.");
        String adj1 = input.nextLine();

        System.out.println("Please enter a verb.");
        String verb1 = input.nextLine();

        System.out.println("Please enter a name.");
        String name2 = input.nextLine();

        System.out.println("Please enter a place.");
        String place1 = input.nextLine();

        System.out.println("Please enter a verb.");
        String verb2 = input.nextLine();

        System.out.println("Please enter a number.");
        String num1 = input.nextLine();

        System.out.println("Please enter a plural noun.");
        String noun2 = input.nextLine();

        System.out.println("Please enter a verb.");
        String verb3 = input.nextLine();
        
        System.out.println(name1 + " is enjoying some time with their favorite " + noun1 + " at home. It is a nice, sunny day outside.");
        System.out.println("Then, all of a sudden, a " + adj1 + " person named " + name2 + " comes up to the house and proceeds to " + verb1 + " down the door. " + name2 + " looks like they just came from " + place1 + ".");
        System.out.println(name2 + " quickly hurries over to " + name1 + ". " + name2 + " begins to " + verb2 + " " + num1 + " times and then runs outside to look at the " + noun2 + " outside of the house.");
        System.out.println(name1 + " looks on in shock. What just happened?");
        System.out.println("Well, it turns out that " + name2 + " likes to " + verb3 + " a lot. Maybe that explains it, but... probably not.");
        System.out.println("The end.");
    }
}