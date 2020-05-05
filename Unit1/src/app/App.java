package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the capital of North Carolina?");

        String ans1 = input.nextLine();

        if(ans1.equals("Raleigh")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }

        System.out.println("How many centimeters are in a meter?");

        String ans2 = input.nextLine();

        if(ans2.equals("100")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }

        System.out.println("Who was the 2nd president of the United States?");

        String ans3 = input.nextLine();

        if(ans3.equals("John Adams")){
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
        
        System.out.println("What is the count?");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        
        
    }
}