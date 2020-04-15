package app;

public class App {
    public static void main(String[] args) throws Exception {

        for(int i1 = 10; i1 <= 20; i1 = i1 + 1){
            System.out.println("Count 1 reads " + i1);
        }
        System.out.println("20 reached. Count 1 complete.");

        for(int i2 = 10; i2 <= 100; i2 = i2 + 1){
            System.out.println("Count 2 reads " + i2);
        }
        System.out.println("100 reached. Count 2 complete.");

        for(int i3 = 1000; i3 <= 256000; i3 = i3 + 1000){
            System.out.println("Count 3 reads " + i3);
        }
        System.out.println("256000 reached. Count 3 complete.");

        for(int i4 = 11; i4 <= 12; i4 = i4 + 1){
            System.out.println("Count 4 reads " + i4);
        }
        System.out.println("12 reached. Count 4 complete.");

        for(int i5 = 10; i5 >= 0; i5 = i5 - 1){
            System.out.println("Count 5 reads " + i5);
        }
        System.out.println("0 reached. Final countdown complete.");

    }
}