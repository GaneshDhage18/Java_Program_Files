
/**
 * Find__Power
 */
import java.util.Scanner;

public class Find__Power {
    public static void main(String[] args)

    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the base");
        int base = s.nextInt();

        System.out.println("Enter the power");
        int power = s.nextInt();
        int num = 1;

        for (int i = 1; i <= power; i++) {
            num = num * base;
        }

        System.out.println(num);
        s.close();
    }

}