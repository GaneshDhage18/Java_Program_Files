import java.util.Scanner;
public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the decimal number");
        int num = s.nextInt();
        String sh = "";
        while(num>0)
        {
            int rem = num%8;
            sh = rem+sh;
            num=num/8;
        }
        System.out.println(sh);
        s.close();
    }
}
