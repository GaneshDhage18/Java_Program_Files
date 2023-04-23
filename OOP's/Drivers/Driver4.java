class Pen
{
    String colour;
    String company;

    public void display()
    {
        System.out.println("The deatils of pen is:");
        System.out.println("The colour of pen is: "+colour);
        System.out.println("The comapnay of pen is: "+company);
        System.out.println();
    }
    public void set(String x, String y)
    {
        colour = x;
        company = y;
    }
}


public class Driver4 
{
    public static void main(String[] args) 
    {
        Pen p1 = new Pen();
        p1.set("Red","Cello");
        p1.display();

        Pen p2 = new Pen();
        p2.set("Black","Trimax");
        p2.display();
    }
}
