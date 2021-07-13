import java.util.ArrayList;
import java.util.HashMap;

public class ornek {

    public static void main(String[] args) {
        
        ornek u1 = new ornek();
        u1.createStudent(3);

        calculateAveage();

        System.out.println("Class average: " + calculateTotalAverage());

    }

    public static String[] names = {"Emin","Melisa","Merve","Batu","Efe","Bilgen","Kerem"};

    public static ArrayList<Student> students = new ArrayList<Student>();

    public static HashMap<Student ,Double > averages = new HashMap<Student, Double>(); 

    public void createStudent(int studentCount){

        for(int i = 0 ; i < studentCount ; i++){

            Student tempStudent = new Student(i, names[i] , Math.random() * 100 ,Math.random() * 100 ,Math.random() * 100 );

            students.add(tempStudent);

        }


    }

    public static void calculateAveage(){

        for( Student s : students ){

            double average = (s.mid1 + s.mid2 + s.fin) / 3;

            System.out.println(s.name +"'s average is " + average);

            averages.put(s,average);

        }


    }

    public static double calculateTotalAverage(){

        double sum = 0;
        for( double avg : averages.values()){
            sum = sum + avg;
        }

        return sum / students.size();

    }

    
}


class Student{

    // Attributes
    public int studentID;
    public String name;
    public double mid1,mid2,fin;

    public Student(int studentID, String name, double mid1,double mid2, double fin  ){
        this.studentID = studentID;
        this.name = name;
        this.mid1 = mid1;
        this.mid2 = mid2;
        this.fin = fin;
    }

    public String toString(){

        return "Name: " + this.name + "\n" 
              +"ID: " + this.studentID + "\n"
              +"Mid 1: " + this.mid1 + "\n"
              +"Mid 2: " + this.mid2 + "\n"
              +"Fin: " + this.fin + "\n";

    }

}


