import java.util.Scanner;
public class Octal_Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        String res = "";

        while(num>0)
        {
            int rem = num%8;
            res = rem+res;
            num=num/8;
        }
        System.out.println(res);
        s.close();
    }
}
