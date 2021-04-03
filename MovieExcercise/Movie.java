package MovieExcercise;

public class Movie {

    public static void main(String[] args) {

        Movie m1 = new Movie("Leon: The Professional", 5,10);
        m1.getInfo();
        System.out.println();
        Movie m2 = new Movie ("Stockholm",2,20);
        m2.getInfo();
    }

    private String title;
    private int rating;
    private int ticketprice;

    //constructor
    public Movie(String t, int r,int p) {
         this.title=t;
         this.rating=r;
         this.ticketprice=p;
    }

    public void getInfo() {
        System.out.println("Title is: "+this.title);
        System.out.println("Rating is "+this.rating);
        System.out.println("Ticket price is: "+this.ticketprice);
    }

}