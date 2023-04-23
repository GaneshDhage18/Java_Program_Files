import java.util.Scanner;
public class Decimal_Binary 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the decimal number");
        int num = s.nextInt();
        String res = "";

        while(num>0)
        {
            int rem = num%2;
            res = rem+res;
            num=num/2;
        }
        System.out.println(res);
        s.close();
    }
}
