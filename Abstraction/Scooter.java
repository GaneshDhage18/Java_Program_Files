package Abstraction;

abstract class vehicle
{
    abstract void start();
}

class Car extends vehicle
{
    void start()
    {
        System.out.println("Car starts with key");
    }
}

class Scooter extends vehicle
{
    void start()
    {
        System.out.println("Scooter starts with kick");
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}

