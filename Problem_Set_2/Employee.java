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

    public static void main(String[] args){

        Employee e1 = new Employee("Emin Kartci",2008,10000,"Kagithane/Istanbul");
        Employee e2 = new Employee("Kagan Ozturkoglu",2020,2000,"Bursa-Istanbul");
        Employee e3 = new Employee("Sinem Ozturk",2018,12000,"Cekmekoy-Istanbul");
        Employee e4 = new Employee("Deniz Temel",2022,1000,"Atasehir-Istanbul");

        Employee[] employees = {e1,e2,e3,e4};

        for( Employee employee : employees){
            employee.print_employee();
        }
    }

    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    private static final double MIN_SALARY = 2600;

    // MAIN Constructor
    public Employee(String name,int yearOfJoining,double salary,String address){
        this.name           = name;
        this.yearOfJoining  = yearOfJoining;
        this.salary         = salary;
        this.address        = address;
    }

    // Secondary Constructor
        // If we don't decleare the salary it will be automatically minimum
    public Employee(String name,int yearOfJoining,String address){
        this(name,yearOfJoining,MIN_SALARY,address);
    }

    public void print_employee(){

        String employee_content = this.name + "\t"+ this.yearOfJoining +"\t" + this.address;

        if (this.name.length() <16){
            employee_content = this.name + "\t\t"+ this.yearOfJoining +"\t" + this.address;
        }

        System.out.println(employee_content);
    }

}