package SuperCall;

public class Snapchat
{
    public static void main(String[] args) 
    {
        SnapChat s = new SnapChat("User1","123","Emoji");
        System.out.println(s.un);
        System.out.println(s.ps);
        System.out.println(s.type);

    }
}
    class Massenger
    {
        String un;
        String ps;
        Massenger()
        {
            
        }
        Massenger(String un, String ps)
        {
            this.un=un;
            this.ps=ps;
        }
    }

class SnapChat extends Massenger
{
        String type;
        SnapChat()
        {

        }

        SnapChat(String un, String ps, String type)
        {
            super(un,ps);
            this.type=type;
        }
}

