package Extract;

/**
 * Extract__method
 */
import java.util.Scanner;
public class Extract__method 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = s.nextInt();
        extract(num);
        s.close();
    }

    public static int extract(int num)
    {
        int res=0;
        while(num>0)
        {
            res = num%10;
            System.out.println(res);
            num=num/10;
        }
        return res;
    }
    
}