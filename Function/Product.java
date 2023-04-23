import java.util.*;
public class Product 
{
    public static int calculateOfProduct(int a, int b)
    {
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("The product is: "+calculateOfProduct(a, b));
        s.close();
    }
}
