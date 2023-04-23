import java.util.Scanner;
public class Char_Even_odd 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number");   
        int num = s.nextInt();
        char ch ='a';

        if(num>=1 || num<=26)
        {
            ch+=num-1;
            System.out.println(ch);
        }
        else
        {
            System.out.println("Odd");
        }
        s.close();
    }
}
