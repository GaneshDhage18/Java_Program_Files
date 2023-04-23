import java.util.Scanner;
public class Spynumber 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int sum=0;
        int temp=num; int prod=1;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            prod=prod*rem;
            num=num/10;
        }
        if(sum==prod)
        {
            System.out.println(temp+" is Spynumber");
        }
        else
        {
            System.out.println(temp+" is Not Spynumber");
        }
        s.close();
    }
}
