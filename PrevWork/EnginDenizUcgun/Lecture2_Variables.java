package PrevWork.EnginDenizUcgun;

public class Lecture2_Variables {

    public static void main(String[] args) {
        
        Student student1 = new Student(21,"Deniz");
        Student student2 = new Student(22,"Emin"); 
        student2.friends[0] = student1;
        //introduce(student1);
        baklava(9);

    }

    public static void introduce(int yas,String name) {
        System.out.println(name + " is " + yas + " years old.");
    }

    public static void introduce(Student s) {
        System.out.println(s.name + " is " + s.age + " years old.");
    }

    public static void printRect(int h, int w){

        for(int k = 0 ; k < h ; k++){
            for(int j =0 ; j < w ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }

    public static void printTriangle(int h){

       /*

        h = 0 - 2 space - 1 star - 1 space - 3 star 
        h = 1 - 1 space - 3 star - 2 space - 1 star
        h = 2 - 0 spcae - 5 star


          *
         ***
        *****

           *
          ***
         *****
        *******
       */

        for(int i = 0 ; i < h ; i++){

            for(int j = 0 ; j < (h-1) - i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i + 1 ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        

    }

    public static void printdoubleTriangle(int h){

        /*
 
         h = 0 - 2 space - 1 star - 1 space - 3 star 
         h = 1 - 1 space - 3 star - 2 space - 1 star
         h = 2 - 0 spcae - 5 star
 
 
           *
          ***
         *****
 
            *
           ***
          *****
         *******
        */
 
         for(int i = 0 ; i < h ; i++){
 
             for(int j = 0 ; j < (h-1) - i ; j++){
                 System.out.print(" ");
             }
             for(int j = 0 ; j < 2*i + 1 ; j++){
                 System.out.print("*");
             }
             for(int j = 0 ; j < ((h-1) - i)*2 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i + 1 ; j++){
                System.out.print("*");
            }
             
             System.out.println();
         }
         
 
     }

    public static void baklava(int h){

        /*

           *
          ***
         *****
         -***
         --*
         
         h = 2 -> 1
         h = 3 -> 3
         h = 4 -> 5

         2n -3 

       */
        printdoubleTriangle(h);

        for(int i = 0 ; i < h -1 ; i++){

            for(int j = 0 ; j < i + 1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j< (2*h-3) - 2*i; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < (i + 1)*2 ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j< (2*h-3) - 2*i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}


class Student{
    int age;
    String name;

    Student[] friends = new Student[5];

    // Constructor
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
}
