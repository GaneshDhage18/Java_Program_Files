package Sorting;
public class Selection_Sort 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,9,2,8,1,6,4};
        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            System.out.println(arr[i]);
        }
    }
}
