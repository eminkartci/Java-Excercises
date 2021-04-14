package Extra_Questions;

import java.util.ArrayList;
import java.util.Random;

// In a call center, there are two operators at work. The first operator is more successful than the second
// operator and solves the problem of customers on the phone with probability 0.05 at each arriving call.
// This probability is equal to 0.02 for the second operator. Suppose the manager randomly selects one of
// these operators without knowing which one is more successful, what is the probability that:


public class ProbabilityOperators {

    public static Random myRand = new Random();

    public static ArrayList<Integer> opt1 = new ArrayList<Integer>();
    public static ArrayList<Integer> opt2 = new ArrayList<Integer>();
    

    public static void main(String[] args){

        
        
        double success = 0;
        double fail    = 0;

        for (int i = 0 ; i < 12000 ; i++){

            if(call()){
                success++;
            }else{
                fail++;
            }
        }

        double rate = success / (success+fail);

        System.out.println("The success probability is: "+ rate);

        seeOperatorHistories();
    }

    public static void seeOperatorHistories(){

        System.out.println("OPERATOR 1");
        System.out.println(opt1);

        System.out.println("OPERATOR 2");
        System.out.println(opt2);


    }

    public static boolean call(){

        // Operator 1
        if(myRand.nextBoolean()){

            // Fail
            if(myRand.nextInt(100) >= 5){
                opt1.add(0);
                return false;
            // Success
            }else{
                opt1.add(1);
                return true;
            }

        // Operator 2    
        }else{

            // Fail
            if(myRand.nextInt(100) >= 2){
                opt2.add(0);
                return false;
            // Success
            }else{
                opt2.add(1);
                return true;
            }

        }

    }
    
}
