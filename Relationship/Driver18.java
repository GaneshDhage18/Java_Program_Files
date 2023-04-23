package Relationship;

public class Driver18 
{
    public static void main(String[] args) 
    {
        Phone p = new Phone("Nokia", "1100");
        p.insertsim(1234567890, "Jio");
        p.display();
        p.s.display();
    }
}

class Sim
{
    long number;
    String network;

    Sim(long number, String network)
    {
        this.number=number;
        this.network=network;
    }
    public long getnumber()
    {
        return number;
    }
    public String getnetwork()
    {
        return network;
    }

    public void display()
    {
        System.out.println("The details of sim are: ");
        System.out.println("The number is: "+number);
        System.out.println("The network is: "+network);
    }
}

class Phone
{
    String company;
    String model;
    Sim s;

    Phone(String company, String model)
    {
        this.company=company;
        this.model=model;
    }

    public String getcomapny()
    {
        return company;
    }
    public String getmodel()
    {
        return model;
    }

    public void insertsim(long number, String network)
    {
        this.s = new Sim(number,network);
    }

    public void display()
    {
        System.out.println("The details of phone are: ");
        System.out.println("The company is: "+company);
        System.out.println("The model is: "+model);
    }
}
