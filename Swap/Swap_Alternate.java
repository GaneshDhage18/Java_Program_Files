package Swap;

public class Swap_Alternate 
{
    public static void swapAlternate(int arr[], int n)
    {
        for(int i = 0; i < n; i+=1)
        {
            for(int j = i+1; j < n; j+=1)
            {
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        swapAlternate(arr, n);
    }
}
