public class Upcasting2 
{
    public static void main(String[] args) {
        child c = new child();
        parent p = c;  // Upcasting

        parent s1 = new child();
        child c1 = (child)s1;  // Downcasting

        child c2 = (child) p; // Downcasting
        c2.dispaly();

        p.dispaly();
        c.dispaly();

        c1.dispaly();
        s1.dispaly();
    }
}

class parent
{
    public void dispaly()
    {
        System.out.println("parent");
    }
   
}
class child extends parent
{
    public void dispaly()
    {
        System.out.println("Child");
    }
}