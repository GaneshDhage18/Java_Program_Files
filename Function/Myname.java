import java.util.Scanner;

public class Myname 
{
    public static void MyName(int n)
    {
        for(int i=0; i <= n; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=n; i >= 0; i--)
        {
            System.out.print(i+" ");
        }
        return;
    }
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        MyName(n);
        System.out.println();
        MyName(n);
        s.close();
    }    
}
