package Practice_Program;

public class Palindromenumber 
{
    public static void main(String[] args) 
    {
        int num=0;
        int count=1;
        int a[] = {5,3,5,2,5,5};

        for(int i=0; i < a.length; i++)
        {
            for(int j=i+1; j < a.length; j++)
            {
                if(a[i]==a[j])
                {
                    num=a[i];
                    count++;
                    break;
                }
            }
        }  
        System.out.println(num+" is appear "+count+" times");  
       // System.out.println(count);  
    }
}
