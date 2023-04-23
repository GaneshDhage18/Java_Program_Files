

public class Driver7
{
    public static void main(String[] args) 
    {
        SnapChat1 s = new SnapChat1("User1","123","Emoji");
        System.out.println(s.un);
        System.out.println(s.ps);
        System.out.println(s.type);
    }
}
    class Messenger
    {
        String un;
        String ps;
        Messenger()
        {
            
        }
        Messenger(String un, String ps)
        {
            this.un=un;
            this.ps=ps;
        }
    }

class SnapChat1 extends Messenger
{
        String type;
        SnapChat1()
        {

        }

        SnapChat1(String un, String ps, String type)
        {
            super(un,ps);
            this.type=type;
        }
}

