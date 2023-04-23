package Constructor;


/* ====   Constuctor Overloding   ==== */

public class Driver11 
{
    public static void main(String[] args) 
    {
        Beach b = new Beach();
        b.display();
        System.out.println();

        Beach b1 = new Beach("Sprite",true);
        b1.display();
        System.out.println();

        Beach b2 = new Beach(true,"Maza");
        b2.display();
        System.out.println();

        Beach b3 = new Beach("Slice",true,false);
        b3.display();   
    }
}

class Beach
{
    boolean paragliding;
    boolean scoobadiving;
    String cooldrink;

    Beach()
    {
    }

    Beach(String cooldrink, boolean scoobadiving)
    {
        this.cooldrink=cooldrink;
        this.scoobadiving=scoobadiving;
    }

    Beach(boolean paragliding, String cooldrink)
    {
        this.paragliding=paragliding;
        this.cooldrink=cooldrink;
    }

    Beach(String cooldrink, boolean paragliding, boolean scoobadiving)
    {
        this.cooldrink=cooldrink;
        this.paragliding=paragliding;
        this.scoobadiving=scoobadiving;
    }

    public void display()
    {
        System.out.println("The details are:");
        System.out.println("The cooldrink is: "+cooldrink);
        System.out.println("The status of scoobadiving: "+scoobadiving);
        System.out.println("The status of paragliding: "+paragliding);
    }
}
