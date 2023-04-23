package Recursion;

public class Even 
{
   
    public static void printSum(int i, int n, int sum)
    {
        if(i == n)
        {
            System.out.println(sum);
            return;
        }
        else if(i % 2 == 0)
        {
            System.out.println(i);
        }
        
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n = 11;

        printSum(1, 11, 0);
    }
}
