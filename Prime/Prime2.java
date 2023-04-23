import java.util.Scanner;
public class Prime2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int count=0;

        if(num==0 || num==1)
        {
            System.out.println("Not prime");
        }
        else
        {
            int i;
            for(i=2; i<=num-1; i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("Not prime");
            }
            else
            {
                System.out.println("Prime");
            }
        }
        s.close();
    }
}
