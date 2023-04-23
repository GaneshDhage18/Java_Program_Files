package Extract;
import java.util.*;
public class Find__Product 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int prod=1;

        while(num>0)
        {
            int rem=num%10;
            prod=prod*rem;
            num=num/10;
        }
        System.out.println(prod);
        s.close();
    }
}
