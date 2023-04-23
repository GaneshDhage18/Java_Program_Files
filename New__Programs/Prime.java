import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int count=0;

        if(num==0 || num==1)
        {
            System.out.println("The no is not prime");
        }

        else
        {
            for(int i=2; i<=num-1; i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("The number is not prime");
            }
            else
            {
                System.out.println("The number is prime");
            }
        }
        s.close();
    }
}
