package Inheritance;

class A
{
    void ShowA()
    {
        System.out.println("A class Method");
    }
}

class B extends A
{
    void ShowB()
    {
        System.out.println("B class Method");
    }
}

class C extends B
{
    void ShowC()
    {
        System.out.println("C class Method");
    }
}


public class Multi_Level 
{
    public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.ShowA();
        //  obj1.Showb();
        //  obj1.Showc();
        System.out.println("--------------------------------");

        B obj2 = new B();
        obj2.ShowA();
        obj2.ShowB();
        //obj2.ShowC();
        System.out.println("---------------------------------");

        C obj3 = new C();
        obj3.ShowA();
        obj3.ShowB();
        obj3.ShowC();
    }
}
