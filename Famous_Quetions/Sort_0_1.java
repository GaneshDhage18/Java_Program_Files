package Famous_Quetions;

public class Sort_0_1
{
    public static void sort0and1(int arr[], int n)
    {
        for(int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] > temp)
            {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {0, 1, 0, 0, 1, 0, 1, 1, 0};
        int n = arr.length;

        sort0and1(arr, n);
    }
}
