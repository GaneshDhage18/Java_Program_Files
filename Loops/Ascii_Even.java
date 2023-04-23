import java.util.Scanner;
public class Ascii_Even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //we will find the ascii values between the range

        System.out.println("Enter any two character");
        char ch1 = s.next().charAt(0);
        char ch2 = s.next().charAt(0);
        int num1 = (int)ch1;
        int num2 = (int)ch2;

        int i= num1;
        while (i<=num2) {

            if(i%2==0)
            {
                System.out.println(i);
            }

            else
            {
                //System.out.println(i);
            }
            i++;
        }
        s.close();
    }
}

