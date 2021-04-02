package Quiz2;

public class Rectangle {

    // MAIN METHOD
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(4,10);
        r1.drawRectangle();

        System.out.println(r1.perimeter(2));
        System.out.println(r1.perimeter(1));

        Rectangle r2 = new Rectangle(10,4);
        r2.drawRectangle();

        System.out.println(r1.perimeter(2));
        System.out.println(r1.perimeter(3));
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
}
