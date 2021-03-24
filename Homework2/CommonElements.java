package Homework2;

/*

6. Write a method that prints the common elements between two arrays of strings.

*/


public class CommonElements {

    public static void main(String[] args){

        // Initialize 2 string arrays
        String[] nameList1 = {"Emin","Melisa","Ada","Sinem"};
        String[] nameList2 = {"Deniz","Kagan","Metin","Cansu","Emin","Ada"};

        // Call the method
        find_common_btw_two_string_arrays(nameList1,nameList2);
        
    }

    // 2 inputs
        // String arrays
    public static void find_common_btw_two_string_arrays(String[] arr1,String[] arr2){

        // Iterate all items in arr1
        for(String item1 : arr1){
            // Iterate all items in arr2
            for(String item2 : arr2){

                // Compare the elements
                if(item1.equals(item2)){
                    // inform
                    System.out.println("The element " + item1 + " is common.");
                }

            }

        }

    }
    
}
