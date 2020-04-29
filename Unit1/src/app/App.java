package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the password.");

        String pass = input.nextLine();

        if(pass.equals("183726073")){
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}