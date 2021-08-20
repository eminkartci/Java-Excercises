package EnginDenizUcgun;

public class Lecture3_MonteCarlo{

    public static void main(String[] args) {

        
        
    }

    public static String flipCoin(){

        if(Math.random() < 0.5){
            return "T";
        }else{
            return "H";
        }

    }

    public static void testFlipCoin(int count){

        double Hcount = 0;
        double Tcount = 0;

        for(int i = 0 ; i < count ; i++){
            if(flipCoin().equals("H")){
                Hcount++;
            }else{
                Tcount++;
            }
        }
        
        System.out.println(" Total flip count: "+ count);
        System.out.println(" H : " + Hcount);
        System.out.println(" T : " + Tcount);
        System.out.println(" H % : " + (Hcount / count) * 100);
        System.out.println(" T % : " + (Tcount/ count) * 100);


    }

}