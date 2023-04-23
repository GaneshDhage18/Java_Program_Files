import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int rem = square % 10;

            sum = sum + rem;
            square = square / 10;
        }
        if (num == sum) {
            System.out.println(num + " is Neon number");
        } else {
            System.out.println(num + " is not Neon number");
        }
        s.close();
    }
}
