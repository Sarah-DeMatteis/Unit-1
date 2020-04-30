package app;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the count?");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        
    }
}