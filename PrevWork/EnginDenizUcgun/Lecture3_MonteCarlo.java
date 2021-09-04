package PrevWork.EnginDenizUcgun;

public class Lecture3_MonteCarlo{

    public static void main(String[] args) {

        sarhosAdam(31);
        
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

    public static void sarhosAdam(int adimSayisi){

        int baslangicPozisyonu = 0 ;
        int[] pozisyonlar = new int[adimSayisi];

        for (int i = 0 ; i < adimSayisi ; i ++){
            if( Math.random() < 0.5 ){ // Sol
                baslangicPozisyonu--;
            }else{ // Sağ
                baslangicPozisyonu++;
            }
            pozisyonlar[i] = baslangicPozisyonu;
        }

        System.out.println("Adam baslangicatan " + baslangicPozisyonu + " kadar sapmistir.");
        for(int i = 0 ; i < pozisyonlar.length ; i++){
            System.out.println("Yürüme Geçmişi: " + pozisyonlar[i]);
        }
        
    }

}