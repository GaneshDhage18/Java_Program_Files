package Famous_Quetions;

public class Pair_Sum 
{
    public static boolean isPair(int arr[], int n, int sum)
    {
        for(int i = 0; i < n; i++) 
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i]+arr[j] == sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 4, 45, 6, 10, -8};
        int n = arr.length;

        if(isPair(arr, n, 10))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
