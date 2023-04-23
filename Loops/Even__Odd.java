import java.util.Scanner;

public class Even__Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();

        int i = 0;
        while (i <= num) {
            if (i % 2 == 0) // It will Print Even numbers
            {
                System.out.println(i + " ");
            }

            // It will Print Odd numbers
            /*
             * else{
             * System.out.println(i+" ");
             * }
             */
            i++;
        s.close();
    }
    }
}