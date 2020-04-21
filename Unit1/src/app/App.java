package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for(int i1 = 0; i1 <= 19; i1++){
            System.out.println(i1);

            if(i1 == 10){

                for(int i2 = 1; i2 <= 5; i2++){
                    System.out.println(i1);
                }
            }
        }

        System.out.println("End first loop");
        System.out.println("Start second loop");

        for(int i3 = -1; i3 <= 19; i3++){

            if(i3 % 3 == 0){               
            } else {
                System.out.println(i3);
            }
        }

        System.out.println("End second loop");
    }
}