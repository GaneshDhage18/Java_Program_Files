class ola
{
    String type1;
    String type2;

    ola(String type1, String type2)
    {
        this.type1=type1;
        this.type2=type2;
    }
}

class cab
{
    ola a;
    public void taxi(String type1, String type2)
    {
        this.a = new ola(type1,type2);
    }
}

class OlaCab
{
    public static void main(String[] args) 
    {
        cab c = new cab();
        c.taxi("car", "auto");
        System.out.println("The details of ola is:");
        System.out.println("The cab is: "+c.a.type1);
        System.out.println("The cab is: "+c.a.type2);
       // System.out.println(c.a);
    }
}