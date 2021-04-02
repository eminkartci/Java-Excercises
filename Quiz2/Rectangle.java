package Quiz2;

import java.util.Scanner;

public class Rectangle {

    // MAIN METHOD
    public static void main(String[] args){

        getRectangleParameters();

        // Rectangle r1 = new Rectangle(4,10);
        // r1.drawRectangle();

        // System.out.println(r1.perimeter(2));
        // System.out.println(r1.perimeter(1));

        // Rectangle r2 = new Rectangle(10,4);
        // r2.drawRectangle();

        // System.out.println(r1.perimeter(2));
        // System.out.println(r1.perimeter(3));
    }

    // Attribute
    private int width;
    private int length;

    // Constructor
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public void drawRectangle(){

        //iterate all rows
        for (int i = 0 ; i < this.width; i++){
            // iterate all columns
            for(int j = 0 ; j < this.length ; j++){

                System.out.print("*");

            }

            // go to next line
            System.out.println();

        }
        
    }

    // Take a constant -> Multily with the result
    public double perimeter(double constant){
        // Perimeter = 2 * (length + width)
        // return = constant * perimeter
        return constant * (double) (this.length + this.width) * 2.0;

    
    }

    public static void getRectangleParameters(){

        Scanner scan = new Scanner(System.in);
        System.out.println("width: "); int width = scan.nextInt();
        System.out.println("length: "); int length = scan.nextInt();

        Rectangle rec =new Rectangle(length, width);
        rec.rectangleInfo();
        
    }

    public void rectangleInfo(){
        System.out.println("---- Rectangle ----");
        System.out.println("Width: "+ this.width);
        System.out.println("Length: "+ this.length);

        System.out.println("Image: \n");
        this.drawRectangle();
    }
}
