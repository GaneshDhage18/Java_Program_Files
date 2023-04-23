import java.util.*;
public class Add_String 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name1 = s.next();
        String name2 = s.next();  
        name(name1,name2);
        s.close();
    }

    public static String name(String name1, String name2)
    {
        String res = name1+ " "+name2;
        System.out.println(res);
        return res;
    }
}
