import java.util.Scanner;
public class Nthprime {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int position = s.nextInt();
        int count=0;
        int i=1;
        while(count<position)
        {
            if(isprime(i))
            {
                count++;
            }
                i++;
        }
        System.out.println("The Prime number at " +position+ "th position is: "+(i-1));
        s.close();
    }
   

    public static boolean isprime(int position)
    {
        if(position==0 || position==1)
        {
            return false;
        }

        else
        {
            int i;
            for(i=2; i<=position-1; i++)
            {
                if(position%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
