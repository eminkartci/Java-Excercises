package PrevWork.Quiz2;

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
        // get side 1 and side 2
        // order doesn't matter width must be greater
    public Rectangle(int side1,int side2){
        // if side 1 is greated
        if (side1 > side2 ){
            // width -> side 1
            this.length     = side2;
            this.width      = side1;
        // otherwise
        }else{
            // width -> side 2
            this.length     = side1;
            this.width      = side2;
        }
        
    }

    public void drawRectangle(){

        //iterate all rows
        for (int i = 0 ; i < this.length; i++){
            // iterate all columns
            for(int j = 0 ; j < this.width ; j++){

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
        System.out.println("Side 1: "); int side1 = scan.nextInt();
        System.out.println("Side 2: "); int side2 = scan.nextInt();

        Rectangle rec =new Rectangle(side2, side1);
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
