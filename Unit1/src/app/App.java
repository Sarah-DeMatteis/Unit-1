package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int i1 = 1; i1 <= 20; i1++) {

            if (i1 % 4 == 0) {
                System.out.println(i1 + " is divisible by 4.");
            } else {
                System.out.println(i1 + " is not divisible by 4.");
            }
        }

        System.out.println("All done");
    }
}