package Recursion;

public class Factorial 
{
    public static void findFactorial(int i, int n, int fact)
    {
        if(i == n)
        {
            fact*=i;
            System.out.println(fact);
            return;
        }
        fact = fact*i;
       findFactorial(i+1, n, fact);
    }
    public static void main(String[] args) 
    {
        int n = 5;
        findFactorial(1, 5, 1);
    }
}
