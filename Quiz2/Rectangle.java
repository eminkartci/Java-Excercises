package Quiz2;

public class Rectangle {

    // MAIN METHOD
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(4,10);
        r1.drawRectangle();

        Rectangle r2 = new Rectangle(10,4);
        r2.drawRectangle();
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
}