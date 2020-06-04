package Unit1.src.app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Thank you for choosing Financial Finance Bank. Please enter your name.");
        String name = input.nextLine();

        System.out.println("Please enter an initial deposit amount.");
        int bal = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a password.");
        String password = input.nextLine();
        
        System.out.println("Please confirm your password.");
        String passConfirm = input.nextLine();
        
        boolean passYes = false;

        while(passYes == false){

            if(passConfirm.equals(password)){
                passYes = true;
            } else {
                System.out.println("Please try again.");
                passConfirm = input.nextLine();
            }
        }

        Account accountOne = new Account(name, bal, password);
        System.out.println("\nThanks for creating an account!\n");

        boolean accessYes = false;
        while(accessYes == false){

            System.out.println("Please log in.");
            System.out.println("Enter your name.");
            String loginName = input.nextLine();

            System.out.println("Enter your password.");
            String loginPass = input.nextLine();

            if(accountOne.name.equals(loginName)){
                if(accountOne.password.equals(loginPass)){
                    accessYes = true;
                    System.out.println("\nWelcome, " + accountOne.name);
                } else {
                    System.out.println("Password incorrect. Please try again.");
                }
            } else {
                System.out.println("Name not recognized. Please try again.");
            }

        }

        boolean loggedIn = true;
        while(loggedIn == true){

            System.out.println("\nWhat would you like to do?");
            System.out.println("\nPress 1 to check balance.\nPress 2 to deposit money.\nPress 3 to withdraw money.\nPress 4 to change password.\nPress 5 to log out.\n");

            int action = input.nextInt();
            input.nextLine();

            if(action == 1){
                System.out.println("Your current balance is $" + accountOne.bal + ".");
            }

            if(action == 2){
                System.out.println("How much would you like to deposit?");
                int depositAmount = input.nextInt();

                bal = bal + depositAmount;
                System.out.println("You now have $" + bal + " in your account.");
            }

            if(action == 3){
                System.out.println("How much would you like to withdraw?");
                int withdrawAmount = input.nextInt();

                bal = bal - withdrawAmount;
                System.out.println("You now have $" + bal + " in your account.");

                if(bal < 0){
                    System.out.println("\nCongratulations! You're in debt!");

                    if(bal < -1000){
                        System.out.println("A $500 fee has been charged.");
                        bal = bal - 500;
                    } else {
                        System.out.println("A $50 fee has been charged.");
                        bal = bal - 50;
                    }
                }
            }

            if(action == 4){
                System.out.println("What would you like to change your password to?");
                accountOne.password = input.nextLine();

                System.out.println("Please confirm your new password.");
                String newPassConfirm = input.nextLine();
        
                boolean newPassYes = false;

                while(newPassYes == false){

                    if(newPassConfirm.equals(accountOne.password)){
                        newPassYes = true;
                    } else {
                        System.out.println("Please reconfirm.");
                        newPassConfirm = input.nextLine();
                    }
                }

                System.out.println("Password successfully changed.");
                System.out.println("Your new password is " + accountOne.password);
            }

            if(action == 5){
                loggedIn = false;
            }
        }
        
    }
}