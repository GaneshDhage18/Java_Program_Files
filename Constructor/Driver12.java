package Constructor;

public class Driver12
{
    public static void main(String[] args) 
    {
        Battery1 b = new Battery1("Duracell", 40.9,20.50);
        b.display();

    }
}

class Battery1
{
    String company;
    double price;
    double power;

    Battery1(String company, double price)
    {
        this.company=company;
        this.price=price;
    }

    Battery1(String company, double price, double power)
    {
        this(company, price);
        this.power=power;
    }

    public void display()
    {
        System.out.println("The details of battery is: ");
        System.out.println("The company name is: "+company);
        System.out.println("The price is: "+price);
        System.out.println("The power is: "+power);
    }
}