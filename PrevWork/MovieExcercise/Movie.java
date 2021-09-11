package PrevWork.MovieExcercise;

public class Movie {

    public static void main(String[] args) {

        // Movie 1
        Movie m1 = new Movie("Leon: The Professional", 5,10);
        m1.getInfo();

        // Movie 2
        Movie m2 = new Movie ("Stockholm",2,20);
        m2.getInfo();

        Movie.compare_movies(m1, m2);
    }

    public static void compare_movies(Movie m1,Movie m2){

        double ratioM1 = (double) m1.getRating() / (double) m1.getTicketPrice();
        double ratioM2 = (double) m2.getRating() / (double) m2.getTicketPrice();

        if (ratioM1 > ratioM2){
            System.out.println("You should go to the "+ m1.getTitle());
        }else if (ratioM1 == ratioM2){
            System.out.println("Both films are OK!");
        }
        else {
            System.out.println("You should go to the "+ m2.getTitle());
        }
    }

    // Attributes
    private String title;
    private int rating;
    private int ticketprice;

    // Constructor
    public Movie(String t, int r,int p) {
         this.title=t;
         this.rating=r;
         this.ticketprice=p;
    }


    public void getInfo() {

        // String content
        String content = "Title         : "+this.title      +"\n"
                        +"Rating        : "+this.rating     +"\n"
                        +"Ticket price  : "+this.ticketprice+"\n";

        // Print
        System.out.println(content);
    }

    // GETTERS
    public int getRating(){
        return this.rating;
    }

    public int getTicketPrice(){
        return this.ticketprice;
    }

    public String getTitle(){
        return this.title;
    }

}