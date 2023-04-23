import java.util.Scanner;
public class Buzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = s.nextInt();

        if(num%7==0 || num%10==7)
        {
            System.out.println(num+" is Buzz number");
        }
        else
        {
            System.out.println(num+" is not Buzz number");
        }
        s.close();
    }
}
