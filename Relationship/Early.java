package Relationship;

public class Early 
{
    public static void main(String[] args) 
    {
        Bike b = new Bike();
        System.out.println(b);
        System.out.println(b.e);
    }
}

class Bike
{
    Engine e = new Engine();
}

class Engine
{

}
