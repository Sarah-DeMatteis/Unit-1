package app;

public class App {
    public static void main(String[] args) throws Exception {
       int count = 0;
       String color = "red";
       boolean isHungry = true;
       
        while (count < 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }
        System.out.println("Count finished");

        while (color == "red") {
            System.out.println("The color is " + color + ", please change");
            color = "blue";
        }
        System.out.println("The color " + color + " is now ready");

        while (isHungry == true) {
            System.out.println("Food needed");
            isHungry = false;
        }
        System.out.println("Giving food...");
        System.out.println("Hunger sated");
    }
}