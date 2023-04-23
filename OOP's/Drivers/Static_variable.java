public class Static_variable 
{
    public static void main(String[] args) 
    {
        S1.display();
        S1.a = 10;
        S1.display();
    }
}

class S1
{
    static int a;
    public static void display()
    {
        System.out.println(a);
    }
}
