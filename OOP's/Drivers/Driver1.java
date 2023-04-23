
class Watch
{
    double price;
    String company;
    String colour;
}


public class Driver1 
{
    public static void main(String[] args) 
    {
        Watch w1 = new Watch();
        w1.price = 150;
        w1.company = "Rolex";
        w1.colour = "Black";

        Watch w2 = new Watch();
        w2.price = 200;
        w2.company = "Fastrack";
        w2.colour = "Brown";

        System.out.println("properties of watch 1 are:");
        System.out.println(w1.price);
        System.out.println(w1.company);
        System.out.println(w1.colour);

        System.out.println("properties of watch 2 are:");
        System.out.println(w2.price);
        System.out.println(w2.company);
        System.out.println(w2.colour);
    }
}
