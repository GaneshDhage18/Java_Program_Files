package Relationship;

public class Lazy 
{
    public static void main(String[] args) 
    {
        FB f = new FB();
        System.out.println(f);
        System.out.println(f.a);
        f.signUp("Marina", "DaddymyChinna");
        System.out.println(f.a.username);
        System.out.println(f.a.Password);
        System.out.println(f.a);
        
    }
}

class Account
{
    String username;
    String Password;

    Account(String username, String password)
    {
        this.username=username;
        this.Password=Password;
    }
}

class FB
{
    Account a;
    public void signUp(String username, String Password)
    {
        this.a = new Account(username,Password);
    }
}