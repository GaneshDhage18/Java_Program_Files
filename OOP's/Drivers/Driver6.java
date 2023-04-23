public class Driver6 
{
    public static void main(String[] args) 
    {
        Qspiders q = new Qspiders();
        q.classroom();
    }   
}

class Qspiders
{
    String number = "1";

    public void classroom()
    {
        String number = "6";
        System.out.println("The classroom is: "+number);
        System.out.println("The Qspiders number is: "+this.number);
    }
}