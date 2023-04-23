import java.util.Scanner;
public class Nthprime1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int count=0;

        int i=1;
        while(count<num)
        {
            if(isPrime(i))
            {
                count++;
            }
            i++;
        }
        System.out.println(" "+(i-1));
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
            for(i=2; i<=num-1; i++)
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
