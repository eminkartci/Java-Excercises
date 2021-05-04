import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReader {

    public static void main(String[] args){

        try {

            File myObj = new File("/Users/eminkartci/Desktop/Kagan/input.txt");
            Scanner myReader = new Scanner(myObj);
            int sum = 0;

            while (myReader.hasNext()) {
              String data = myReader.next();
              System.out.println(data);

                try{
                    int number = Integer.parseInt(data);
                    sum += number;
                }catch(Exception e){
                    
                }

            }
            myReader.close();

            System.out.println("Sum: " + sum);
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
}
