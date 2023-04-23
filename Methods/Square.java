import java.util.*;;
public class Square {
    public static void main(String[] args) 
    {
       square();
    }

    public static void square()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int square = num*num;
        System.out.println(square);
        s.close();

        return;
    }
}
