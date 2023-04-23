package Practice_Program;

import java.util.*;
public class Sunny_number 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int sum = num+1;
       // int res = 
        double res = Math.sqrt(sum);
        double ans = Math.floor(res);

        if(res-ans==0)
        {
            System.out.println("THe given number is sunny number");
        }
        else
        {
            System.out.println("The given number is not sunny number");
        }
        s.close();
    }   
}
