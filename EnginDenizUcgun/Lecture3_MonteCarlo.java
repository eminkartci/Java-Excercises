package EnginDenizUcgun;

public class Lecture3_MonteCarlo{

    public static void main(String[] args) {

        System.out.println("Result: " + flipCoin());
        
    }

    public static String flipCoin(){

        if(Math.random() < 0.5){
            return "T";
        }else{
            return "H";
        }

    }

}