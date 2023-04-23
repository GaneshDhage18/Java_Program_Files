import java.util.*;
public class Findfactorial 
{
    public static void factorial(int num)
    {
        if(num < 0)
        {
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();

        factorial(num);
        s.close();
    }
}
