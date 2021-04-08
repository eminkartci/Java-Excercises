package Extra_Questions;

import java.util.HashMap;

public class HashExample {

    public static void main(String[] args){

        int emin    = 21;
        int melisa  = 20;
        int sinem   = 20;
        
        int[] ages = {21,20,20};

        HashMap<Integer,String> namesAges = new HashMap<Integer,String>();
        
        namesAges.put(21,"Kagan");
        namesAges.put(23,"Emin");
        namesAges.put(20,"Melisa");
        namesAges.put(19,"Zehra");
        namesAges.put(39,"Murat");

        System.out.println(namesAges.get(20));
        System.out.println(namesAges.get(19));

        System.out.println(namesAges.keySet());
        System.out.println(namesAges.values());

        for (String name : namesAges.values()){
            System.out.println(name);
        }

        for (int age : namesAges.keySet()){
            System.out.println(age);
        }

        System.out.println(namesAges);
    }
    
}
