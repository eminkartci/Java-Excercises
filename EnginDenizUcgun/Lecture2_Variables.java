package EnginDenizUcgun;

public class Lecture2_Variables {

    public static void main(String[] args) {
        
        Student student1 = new Student(21,"Deniz");
        Student student2 = new Student(22,"Emin"); 
        student2.friends[0] = student1;
        //introduce(student1);
        printRect(52,2);

    }

    public static void introduce(int yas,String name) {
        System.out.println(name + " is " + yas + " years old.");
    }

    public static void introduce(Student s) {
        System.out.println(s.name + " is " + s.age + " years old.");
    }

    public static void printRect(int h, int w){

        for(int k = 0 ; k < h ; k++){
            for(int i =0 ; i < w ; i++){
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
