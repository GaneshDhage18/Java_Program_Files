package Abstraction;

// Multiple inheritance using interface in java

interface I1
{
    void show(); // interface abstract method
}

interface I2
{
    void display(); // interface abstract method
}
public class Interface_Multiple implements I1, I2
{
    public void show()
    {
        System.out.println("1"); // body of abstract method
    }

    public void display()
    {
        System.out.println("2");  // body of abstract method
    }
    
    public static void main(String[] args) 
    {
        Interface_Multiple a = new Interface_Multiple(); // creating a object

        a.show();
        a.display();
    }
}