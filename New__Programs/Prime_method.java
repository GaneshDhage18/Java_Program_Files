import java.util.*;
public class Prime_method {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        if(isPrime(num))
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        s.close();

    }

    public static boolean isPrime(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        else
        {
            int i;
            for(i=2; i <= num-1; i++)
            {
                
                if(num%i==0)
                {
                    return false;
                }
                
            }
            return true;
        }
        
    }
}
