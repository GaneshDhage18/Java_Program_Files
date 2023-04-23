import java.util.*;
public class Factorial1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
    
        factorial f = new factorial();
        f.findfactorial(num);
        s.close();
    }
}

class factorial
{
    public int findfactorial(int num)
    {
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
    }
}
