package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Double or single digit?");
        
        for(int i = 20; i >= 1; i = i-1){
      
            if(i > 9){
                System.out.println(i + " is double digit");
            } else {
                System.out.println(i + " is single digit");
            }
        }

        System.out.println("Nice!");
        System.out.println("Fast food");

        for(int i = 0; i <= 4; i++){
            System.out.println("Burgers");
            System.out.println("Fries");
        }

        System.out.println("Nice!");

    }
}