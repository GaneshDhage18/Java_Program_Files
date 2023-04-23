import java.util.Scanner;
public class Multiplication 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = s.nextInt();
        int multi = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <=i; j++)
            {
                multi = multi*i;
                System.out.print(multi+" ");
            }
            multi = 1;
          System.out.println();
        }
        s.close();
    }
}
