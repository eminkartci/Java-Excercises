package CourseProgram;

import java.util.ArrayList;

public class Student {

    // attributes
    private String studentID;
    private String name;

    private int maxCredit;
    private int remainedCredit;
    private int courseCount;
    private ArrayList<Course> courses = new ArrayList<Course>();

    // constructor
    public Student(String studentID, String name, int maxCredit){
        this.studentID  = studentID;
        this.name       = name;
        this.maxCredit  = maxCredit;
        remainedCredit   = maxCredit;
    }

    public void printStudent(){

        String content = "\n\n --- Student " + this.studentID + " --- \n"
                        +" Name         : " + this.name         + "\n"
                        +" Course Count : " + this.courses.size()  + "\n"
                        +" Max Credit   : " + this.maxCredit    + "\n";

        System.out.println(content);

    }

    public void takeCourse(Course course){

        if( remainedCredit > course.getCredit() || course.getCapacity() < course.getStudents().size()){
            
            if (checkCourses(course)){
                System.out.println(this.name + " cannot take the " + course.getName() + "course !! ");
            }else {
                this.courses.add(course);
            course.getStudents().add(this);
            this.remainedCredit -= course.getCredit();
            System.out.println(this.name + " take the " + course.getName() + " course successfully !");
            }

        }else{

            System.out.println(this.name + " cannot take the " + course.getName() + "course !! ");

        }


    }

    public boolean checkCourses(Course course){

        for( Course c : this.courses){

            if(c.equals(course)){
                return true;
            }

        }

        return false;

    }

    public void showAllCourses(){

        System.out.println("\n"+this.name + " course list: ");

        for( Course c  : this.courses){
            c.printCourse();
        }

    }
    
}
