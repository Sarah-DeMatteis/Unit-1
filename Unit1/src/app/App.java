package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Free Calculator: Enter two numbers to add, subtract, multiply, or divide.");

         System.out.println("Please enter a first number.");
        int num1 = input.nextInt();

        System.out.println("Please enter a second number.");
        int num2 = input.nextInt();

        while (i == 0) {

            System.out.println("Please select an operation for your numbers.");
            System.out.println("Type 1 for add, 2 for subtract, 3 for multiply, or 4 for divide");
            int operation = input.nextInt();

            if(operation == 1){
                int ans = num1 + num2;
                System.out.println(ans);
                i = 1;
            } else {
                if(operation == 2){
                    int ans = num1 - num2;
                    System.out.println(ans);
                    i = 1;
                } else {
                    if(operation == 3){
                        int ans = num1 * num2;
                        System.out.println(ans);
                        i = 1;
                    } else {
                        if(operation == 4){
                            int ans = num1 / num2;
                            System.out.println(ans);
                            i = 1;
                        } else {
                            System.out.println("Sorry, your operation was not recognized. Please reenter your operation and try again.");
                        }
                    }       
                }
            }
        }


    }
}