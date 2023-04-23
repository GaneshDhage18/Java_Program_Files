/**
 * Upcasting1
 */
public class Upcasting1 
{
    public static void main(String[] args) {
        Ballpen b = new Ballpen();
        Pen1 p = b;
    }
    
}

class Pen1
{
    String color;
}

class Ballpen extends Pen1{
    double price;
}