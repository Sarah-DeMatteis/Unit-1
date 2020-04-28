package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name.");
        String lastName = input.nextLine();

        System.out.println("Please enter your age.");
        String age = input.nextLine();

        System.out.println("Please enter your grade number. If you are in kindergarten, please type K. If you are in preschool, please type preK.");
        String grade = input.nextLine();

        System.out.println("Please enter your favorite color.");
        String favColor = input.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + ". You are " + age + " years old and are in grade " + grade + ". You picked " + favColor + " as your favorite color, so it is clear you have good taste.");
       
    }
}