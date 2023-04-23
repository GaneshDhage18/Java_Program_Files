package Practice_Program;

class FibonacciExample1
{  
    public static void main(String[] args) 
    {
        int a = 0, b=1;
        System.out.print(a + " " + b+" ");
        int num=10;

        for(int i=2; i <=num; i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
} 
