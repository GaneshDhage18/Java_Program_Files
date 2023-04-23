package Inheritance;

class A
{
    int i = 10;
}

class B extends A
{
    int i = 20;

    void display(int i)
    { 
        System.out.println(i);
    }

    public static void main(String[] args) 
    {
        B obj = new B();

        obj.display(30);
        
    }
}
