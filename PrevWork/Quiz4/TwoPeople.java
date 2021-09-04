package Quiz4;

public class TwoPeople {

    public static void main(String[] args){

        // Create 2 People
        Person john = new Person(72,80);
        Person deniz = new Person(45,85);

        // Print John
        System.out.println("John's height in inches is "+ john.getHeight());
        System.out.println("John's weight in kilograms is "+ john.getWeight());
        // Print Deniz
        System.out.println("Deniz's height in inches is "+ deniz.getHeight());
        System.out.println("Deniz's weight in kilograms is "+ deniz.getWeight());

    }
    
}
