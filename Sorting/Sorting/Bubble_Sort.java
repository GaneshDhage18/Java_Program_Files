package Sorting;

public class Bubble_Sort 
{
    public static void main(String[] args) 
    {
        int arr[] = {9,2,8,1,7,4};
        int n = arr.length;
        int temp = 0;

        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < n-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int j = 0; j < n; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
