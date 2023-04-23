import java.util.Scanner;
class Pyramid
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nuber");
        int num = s.nextInt();
    
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num; j++)
            {
                if(i==1 || j==1 || i==num || j==num)
                {
                    System.out.print(" *");
                }
                else if(i==num/2 && j==num/2)
                {
                    System.out.print(" $");
                }
                else
                {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
