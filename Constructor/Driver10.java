package Constructor;

public class Driver10 
{
    public static void main(String[] args) 
    {
        AsiaCup a = new AsiaCup(6, "India", "71th");
        System.out.println(a.teams);
        System.out.println(a.ivp);
        System.out.println(a.vks);
    }
}

class AsiaCup
{
    int teams;
    String ivp;
    String vks;

    AsiaCup(int teams, String ivp, String vks)
    {
        this.teams=teams;
        this.ivp=ivp;
        this.vks=vks;
    }
}