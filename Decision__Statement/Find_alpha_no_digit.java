import java.util.*;
public class Find_alpha_no_digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string");
        char ch = s.next().charAt(0);

        if((ch>='A' && ch<='z') || (ch>='a' && ch<='z'))
        {
            System.out.println(ch+" is a alphabet");
        }

        else if((ch>='0' && ch<='9'))
        {
            System.out.println(ch+" is a digit");
        }

        else
        {
            System.out.println(ch+" is a Special character");
        }
        s.close();
    }
}
