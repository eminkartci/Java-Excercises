package Problem_Set_2;

/*

Write a program that would print the information (name, year of joining,
salary, address) of three employees by creating a class named 'Employee'.
The output should be as follows:
Name Year of joining Address
Robert 1994 Sam 2000 John 1999
64C- Wall Street 68D- Wall Street 26B- Wall Street

*/

public class Employee{

    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // MAIN Constructor
    public Employee(String name,int yearOfJoining,double salary,String address){

        this.name           = name;
        this.yearOfJoining  = yearOfJoining;
        this.salary         = salary;
        this.address        = address;

    }



}