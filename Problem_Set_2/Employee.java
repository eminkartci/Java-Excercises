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

        // Create 3 employees
        Employee e1 = new Employee("Emin Kartci",2008,10000,"Kagithane/Istanbul");
        Employee e2 = new Employee("Kagan Ozturkoglu",2020,2000,"Bursa-Istanbul");
        Employee e3 = new Employee("Sinem Ozturk",2018,12000,"Cekmekoy-Istanbul");
        Employee e4 = new Employee("Deniz Temel",2022,1000,"Atasehir-Istanbul");

        // Play with functions
        e4.setSalary(55);
        e3.setSalary(-55);
        e1.setSalary(3400);

        // Add them into an array
        Employee[] employees = {e1,e2,e3,e4};

        // Print all employees
        print_employees(employees);
        
    }

    // Attributes
        private String name;
        private int yearOfJoining;
        private double salary;
        private String address;

        // CONSTANT 
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
        // Initialize String
        String employee_content = this.name + "\t"+ this.yearOfJoining +"\t\t  " + this.address;

        // If name is short add additonal tab
        if (this.name.length() <16){    
                                          // HERE
            employee_content = this.name + "\t\t"+ this.yearOfJoining +"\t\t  " + this.address;
        }
        // print it
        System.out.println(employee_content);
    }

    public static void print_employees(Employee[] employees){
        // Title
        System.out.println("\n ====> COMPANY EMPLOYEES <====\n\n");
        System.out.println("NAME\t\t\tYEAR OF JOINING\t  ADDRESS");
        System.out.println("----------------------|------------------|--------------------------|");
        // Each employee
        for( Employee employee : employees){
            employee.print_employee();
        }
        // Bottom
        System.out.println("----------------------|------------------|--------------------------|");

    }

    // GETTER - SETTERS

    public void setSalary(double newSalary){
        
        if (newSalary < this.MIN_SALARY){

            System.out.println("You are not allowed this procedure!");
            System.out.println("Min Salary: "+this.MIN_SALARY);
            return;
        }

        this.salary = newSalary;
        System.out.println(this.name+ "'s new salary is "+ this.salary);
    }
}