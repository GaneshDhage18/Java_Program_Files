import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //we will find the ascii values between the range

        System.out.println("Enter any two character");
        char ch1 = s.next().charAt(0);
        char ch2 = s.next().charAt(0);
        int num1 = (int)ch1;
        int num2 = (int)ch2;

       // int num1;
        while (num1<=num2) {
            System.out.println(num1);
            num1++;
        }
        s.close();
    }
}
