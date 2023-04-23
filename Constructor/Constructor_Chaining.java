package Constructor;

/**
 * Constructor_Chaining
 */
public class Constructor_Chaining 
{
    public static void main(String[] args) 
    {
        Battery b = new Battery("Duracell",40.9);   
        b.dispaly();
    }
}

class Battery
{
    String company;
    double price;
    double power;

    Battery(String company, double price)
    {
        this.price=price;
        this.company=company;
    }

    Battery(String company,double price, double power)
    {
        this(company,price);
        this.power=power;
    }

    public void dispaly()
    {
        System.out.println("THe details are:");
        System.out.println("The company name is:"+company);
        System.out.println("The price is:"+price);
        System.out.println("THe power is:"+power);
    }
}