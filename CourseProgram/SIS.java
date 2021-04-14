package CourseProgram;

import java.util.ArrayList;
import java.util.Random;

public class SIS {

    
    public static Random random = new Random();

    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args){
        
        // Courses
        courses.add(new Course("IE246",6,60,1));  //  1 -> Tuesday
        courses.add(new Course("IE396",5,40,3));  //  1 -> Tuesday
        courses.add(new Course("EE350",6,60,0));  //  1 -> Tuesday
        courses.add(new Course("Korece",6,20,4));  //  1 -> Tuesday


        // Student
        students.add(new Student("S014877","Emin",42));
        students.add(new Student("S015076","Sinem",42));
        students.add(new Student("S015459","Melisa",42));
        students.add(new Student("S015451","Yavuz",30));

        

        for (int i = 0 ; i < random.nextInt(10) + 10 ; i++){
            randomTrial();
        }

        printCourses();
        printStudents();

        students.get(0).showAllCourses();

    }

    public static void printCourses(){

        for (Course c : courses){
            c.printCourse();
        }

    }

    public static void printStudents(){

        for(Student s: students){
            s.printStudent();
        }

    }

    public static Course getRandomCourse(){

        int randomIndex = random.nextInt(courses.size());

        return courses.get(randomIndex);

    }

    public static Student getRandomStudent(){

        int randomIndex = random.nextInt(students.size());

        return students.get(randomIndex);

    }

    public static void randomTrial(){

        Course c = getRandomCourse();
        Student s = getRandomStudent();

        s.takeCourse(c);

    }
    
}
