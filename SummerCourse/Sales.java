package SummerCourse;

import java.util.HashMap;

public class Sales {

    public static void main(String[] args) {

        int id = 1;
        String productName = "Donut";
        String targetLocation = "İstanbul";
        String date = "16/08/2021";
        double price = 12.4;
        double cost = 3;

        int id2 = 2;
        String productName2 = "Waffle";
        String targetLocation2 = "İstanbul";
        String date2 = "16/08/2021";
        double price2 = 32.4;
        double cost2 = 14;

        int customerID = 1;
        String customerName = "Emin";
        HashMap<Integer, String> customer2name = new HashMap<Integer, String>();
        HashMap<Integer, Integer> customer2product = new HashMap<Integer, Integer>();

        int customerID2 = 2;
        String customerName2 = "Ada";

        int customerID3 = 3;
        String customerName3 = "Cem";

        customer2name.put(customerID,customerName);
        customer2name.put(customerID2,customerName2);
        customer2name.put(customerID3,customerName3);

        customer2product.put(customerID, id);
        customer2product.put(customerID2, id);
        customer2product.put(customerID3, id2);

        System.out.println("Alınan Ürünler: "+customer2product);

    }

    public static void inform(int cid,int pid, HashMap<Integer,String> c2n){

        String content = c2n.get(cid) + ", ";

        System.out.println(content);

    }
    

}
