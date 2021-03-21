package Quiz4;

public class Person {

    // Attributes
    private int height;
    private int weight;

    // Constructor
    public Person(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    // GETTER & SETTER
    public int getHeight(){
        return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setHeight(int height){
        if (height > 0 ){
            this.height = height;
        }
        
    }

    public void setWeight(int weight){
        if (weight > 0){
            this.weight = weight;
        }
    }
    
}
