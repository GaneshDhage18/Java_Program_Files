package Abstraction;


/*  abstract class is restricted class that cannot be used to create objects
   ( to access it, it must be inherited from another class.) */

abstract class Animal
{
    public abstract void animalSound(); // abstract method does not have a body

    // Regular method
    public void sleep()
    {
        System.out.println("Zzzzzzzzzzz");
    }
}

// subclass (inherit from animal)
class pig extends Animal 
{
    public void animalSound()
    {
        // The body of animalsound() is provided here
        System.out.println("The pig says: Wee wee");
    }
}   

public class Abstract_Method 
{
    public static void main(String[] args) 
    {
        pig myPig = new pig(); // Create a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
