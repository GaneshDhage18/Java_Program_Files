package Extract;
import java.util.Scanner;
public class Even__Odd 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();

        while(num>0)
        {
            int res = num%10;
            if(res%2==0)
            {
                System.out.println(res+" is even number");
            }
            else
            {
                System.out.println(res+" is Odd number");
            }
            num/=10;
        }
        s.close();
    }
}
