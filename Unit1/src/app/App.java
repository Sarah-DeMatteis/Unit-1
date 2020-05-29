package Unit1.src.app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Thank you for choosing Financial Finance Bank. Please enter your name.");
        String name = input.nextLine();

        System.out.println("Please enter an initial deposit amount.");
        int startBal = input.nextInt();

        System.out.println("Please enter a password.");
        String idc = input.nextLine();
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

        
        
    
        
        
        Account account = new Account(name, startBal, password);
        


        
        
        
    }
}