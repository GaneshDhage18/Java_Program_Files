import java.util.Scanner;
public class decimal_To_Hexadecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Decimal number");
        int num = s.nextInt();
        String res ="";

        while(num>0)
        {
            int rem = num%16;
            if(rem>=0 && rem<=9)
            res = rem+res;

            else if(rem>=10 && rem<=15)
            {
                char ch = (char)(rem+55);
                res = ch+res;
            }
            num=num/16;
        }
        System.out.println(res);
        s.close();

    }
}
