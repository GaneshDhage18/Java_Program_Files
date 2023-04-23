package Constructor;

public class Driver9 
{
    public static void main(String[] args) 
    {
        Movie m = new Movie("KGF", 250);
        System.out.println(m.name);
        System.out.println(m.price);
    }
}

class Movie
{
    String name;
    double price;

    Movie(String name, double price)  // Parameterized Constructor
    {
        this.name=name;
        this.price=price;
    }
}