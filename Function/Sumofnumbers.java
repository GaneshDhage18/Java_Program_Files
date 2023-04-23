import java.util.Scanner;
public class Sumofnumbers
{
    public static int addNumbers(int a, int b)
    {
        int sum = a+b;
        System.out.println("The sum is: "+sum);
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = s.nextInt();
        int b = s.nextInt();

        addNumbers(a, b);
        s.close();
    }
}
