package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for(int i = 20; i >= 0; i = i - 1){
            System.out.println(i);

            if(i == 10){

                for(int j = 1; j <= 7; j++){
                    System.out.println(i);
                }
            }
        }

        System.out.println("End first loop");
        System.out.println("Start second loop");

        for(int i = 0; i <= 39; i++){

            if(i % 13 == 0){     
                System.out.println("Hey!");
            } else {
                if(i % 4 == 0){
                    System.out.println(i);
                }
            }
        }

        System.out.println("End second loop");
    }
}