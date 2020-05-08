package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Free Calculator: Enter two numbers to add, subtract, multiply, or divide.");
        System.out.println("Please enter a first number.");
        int num1 = input.nextInt();

        System.out.println("Please enter a second number.");
        int num2 = input.nextInt();

        System.out.println("Please select an operation for your numbers.");
        String lol = input.nextLine();

        System.out.println("Type add, subtract, multiply, or divide");
        String operation = input.nextLine();

        if(operation.equals("add")){
            int ans = num1 + num2;
            System.out.println(ans);
        } else {
            if(operation.equals("subtract")){
                int ans = num1 - num2;
                System.out.println(ans);
            } else {
                if(operation.equals("multiply")){
                    int ans = num1 * num2;
                    System.out.println(ans);
                } else {
                    if(operation.equals("divide")){
                        int ans = num1 / num2;
                        System.out.println(ans);
                    } else {
                        System.out.println("Sorry, your operation was not recognized. Please reenter your numbers and try again.");
                    }
                }       
            }
        }


    }
}