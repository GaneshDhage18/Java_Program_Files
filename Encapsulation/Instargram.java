class Account
{
    String username;
    String password;

    Account(String username, String password)
    {
        this.username=username;
        this.password=password;
    }
}

class Insta
{
    Account a;
    public void signUp(String username,String password)
    {
        this.a = new Account(username, password);
    }
}

public class Instargram 
{
    public static void main(String[] args) 
    {
        Insta i = new Insta();
        System.out.println("The details of account is");
        i.signUp("Ganesh", "G@#1810");
        System.out.println("THe username is: "+i.a.username);
        System.out.println("The password is: "+i.a.password);
    }   
}
