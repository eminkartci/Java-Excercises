package PrevWork.SummerCourse;
import java.util.HashMap;

public class HashLecture {

    HashMap<String,Integer> isim_id = new HashMap<String,Integer>();
    String[] isim                   = new String[10];
    int[] id                        = new int[10];

    public static void main(String[] args){

        HashLecture hl              = new HashLecture();
        hl.holdInHashMap();
        hl.holdInArray();
        hl.showArray();

    }

    public void showArray(){

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(isim[i] +" "+id[i]);
        }
    }

    public void holdInArray(){

        isim[0]= "Emin";
        id[0]  = 1;

        isim[1]= "Nihan";
        id[1]  = 2;

        isim[2]= "Cansu";
        id[2]  = 3;

        isim[3]= "Yavuz";
        id[3]  = 4;

        isim[4]= "Yusuf";
        id[4]  = 0;

    }

    public void holdInHashMap(){

        isim_id.put("Emin",1);
        isim_id.put("Nihan",2);
        isim_id.put("Cansu",3);
        isim_id.put("Yavuz",4);
        isim_id.put("Yusuf",10);

        System.out.println(isim_id);

        System.out.println("Yusufun id: " + isim_id.get("Yusuf"));

    }

    
}