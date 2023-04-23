import java.util.Scanner;
public class number_even_odd 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = s.next().charAt(0);

        int num = (int)ch;

        if(num%2==0)
        {
            System.out.println(ch);
        }
        else
        {
            System.out.println("Odd");
        }
        s.close();
    }
}
