package SummerCourse;

import java.util.ArrayList;
import java.util.HashMap;

public class Sales {

    public static void main(String[] args) {

        Order o1 = new Order(1,"Donut","İstanbul","16/08/2021",12.4,3);
        Order o2 = new Order(2,"Waffle","İstanbul","16/08/2021",32.4,14);
        Order o3 = new Order(3,"Cheesecake","Antalya","12/08/2021",15.4,4);


        Customer c1 = new Customer(1,"Emin");
        Customer c2 = new Customer(2,"Ada");
        Customer c3 = new Customer(3,"Cem");

        inform(c3, o1);

    }

    public static void inform(Customer c, Order o) {

        String content = c.name + ", " + o.productName + " ürününü " + o.price + " tl'ye satın almıştır";

        System.out.println(content);

    }

}

class Order {

    // Attribute
    int id;
    String productName;
    String targetLocation;
    String date;
    double price;
    double cost;

    // Constructor
    public Order(int id, String productName, String targetLocation, String date, double price, double cost) {
        this.id             = id;
        this.productName    = productName;
        this.targetLocation = targetLocation;
        this.date           = date;
        this.price          = price;
        this.cost           = cost;
    }

}

class Customer{

    // Attributes
    int id;
    String name;
    ArrayList<Order> orders;

    // Constructor
    public Customer(int id,String name){

        this.id = id;
        this.name = name;
        this.orders = new ArrayList<Order>();

    }

}


