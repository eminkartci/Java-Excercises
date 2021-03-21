package Quiz4;

public class TwoPeople {

    public static void main(String[] args){

        Person john = new Person(72,80);
        Person deniz = new Person(45,85); // DENIZ TEMEL DEGILDIR

        System.out.println("John's height in inches is "+ john.getHeight());
        System.out.println("John's weight in kilograms is "+ john.getWeight());

        System.out.println("Deniz's height in inches is "+ deniz.getHeight());
        System.out.println("Deniz's weight in kilograms is "+ deniz.getWeight());

    }
    
}
