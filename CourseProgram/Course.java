package CourseProgram;

import java.util.ArrayList;

public class Course {
    
    // Attributes
    private String name;
    private int credit;
    private int capacity;

    private ArrayList<Student> students = new ArrayList<Student>();
    
    private int[] day = new int[7];

    // Constructor
    public Course(String name , int credit, int capacity, int day){

        this.name       = name;
        this.credit     = credit;
        this.capacity   = capacity;
        this.day[day]   = 1 ;

    }

    public void printCourse(){

        String content = "\n\n --- Course " + this.name + " --- \n"
                        +" Credit: " + this.credit          + "\n"
                        +" Capacity: " + this.capacity      + "\n"
                        +" Occupied: " + students.size() + "\n";

        System.out.println(content);

    }

    public int getCredit(){
        return this.credit;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

}
