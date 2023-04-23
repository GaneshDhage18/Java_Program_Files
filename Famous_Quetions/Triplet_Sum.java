package Famous_Quetions;

public class Triplet_Sum 
{
    public static void isTriplet(int arr[], int n, int sum)
    {
        for(int i = 0; i < n; i++) 
        {
            for(int j = i+1; j < n; j++)
            {
               for(int k = j+1; k < n; k++)
                {
                    if(arr[i]+arr[j]+arr[k] == sum)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
       
    }
    public static void main(String[] args) 
    {
        int arr[] = {-1, 2, 6, 4, 5, 3};
        int n = arr.length;

        isTriplet(arr, n, 4);
    }
}
