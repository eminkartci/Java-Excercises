package Extra_Questions;

/*

    A nonnegative integer is called a palindrome if it reads forward and backward in the same way. 
For example, the numbers 5, 121, 3443, and 123454321 are palindromes. 
Write a method that takes as input a nonnegative integer and returns 
true if the number is a palindrome; otherwise, it returns false.
*/


public class Palindrome {
    
    public static void main(String[] args){

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


        return true;
    }
}
