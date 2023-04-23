package Inheritance;

class A
{
    void showA()
    {
        System.out.println("A Class Method");
    }
}

class B extends A
{
    void showB()
    {
        System.out.println("B class Method");
    }
}
public class Single_Level 
{
    public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.showA();
        //obj1.showB();

        B obj2 = new B();
        obj2.showA();
        obj2.showB();
    }
}
