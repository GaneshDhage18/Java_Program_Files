import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        String sh ="";

        while(num>0)
        {
            int rem=num%2;
            sh=rem+sh;
            num=num/2;
        }
        System.out.println(sh);
        s.close();

    }
}
