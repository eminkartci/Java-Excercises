package Problem_Set_2;

public class checkSideLengthsTriange {

    public static void main(String[] args){

    }

    public static double[] convertDouble(String[] input){


        double currentNumber = 0;
        double[] output = new double[input.length];

        for(int i = 0 ; i < input.length ; i++){

            try{
                currentNumber = Double.parseDouble(input[i]);
                output[i] = currentNumber;
            }catch(Exception e){
                System.out.println("There is a problem in inputs!!");
            }

        }

        return output;

    }
    
    
}

