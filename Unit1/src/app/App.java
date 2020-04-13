package app;

public class App {
    public static void main(String[] args) throws Exception {

        String person1 = "Jamie";
        String person2 = "Michael";

        String verb1 = "fly";
        String verb2 = "juggle";
        String verb3 = "scream";

        String food = "shrimp scampi";

        String dayOfWeek = "Tuesday";

        String place1 = "Culver's";
        String place2 = "grocery store";

        String adjective1 = "moist";
        String adjective2 = "brilliant";


        System.out.println(person1 + " is a programmer who likes to " + verb1 + ".");
        System.out.println("Every " + dayOfWeek + " they make a " + adjective1 + " " + food + " for breakfast and " + verb2 + " at " + place1 + " with " + person2 + ".");
        System.out.println("Sometimes, they go to the " + adjective2 + " " + place2 + " with " + person2 + " so that they can " + verb3 + " together.");
   
    }
}