package Swap;

public class Array_swap 
{
    public static void main(String[] args) 
    {
        int a[] = {5,2,7,3,9,1};
        int n = a.length;
  
        for(int i = 0; i < n; i++)
        {
            for(int j=i+1; j < n; j++)
            {
                if(a[i] >= a[j])
                {
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
        }

        for(int i=0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}
