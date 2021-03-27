package Extra_Questions;

/*

    A nonnegative integer is called a palindrome if it reads forward and backward in the same way. 
For example, the numbers 5, 121, 3443, and 123454321 are palindromes. 
Write a method that takes as input a nonnegative integer and returns 
true if the number is a palindrome; otherwise, it returns false.
*/


public class Palindrome {
    
    public static void main(String[] args){
        
        // Call the function
        if (isPalindorme(5)){
            System.out.println("This number is palindormes!");
        }else {
            System.out.println("This number is not palindormes!");
        }
    }

    // Palindorme Detector
        // input -> int (non-negative)
    public static boolean isPalindorme(int number){

        // check if the number is valid
        if (number < 0 ){
            // warn the user
            System.out.println("The input is not valid! Number must be non-negative !!!");
            // return
            return false;
        }

        // String operations are easier
            // Convert int to string
        String numberStr = Integer.toString(number);

        // iterate half of string
        for (int i = 0 ; i < numberStr.length() / 2 ; i++){
            // check starting from beginning and end
            char beginning = numberStr.charAt(i);
            char end = numberStr.charAt(numberStr.length() - (i+1));

            // check if they are equal
            if (beginning != end){
                // if any of them is not equal return
                return false;
            }
        }

        // otherwise return
        return true;
    }
}
