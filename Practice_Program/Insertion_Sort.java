package Practice_Program;

public class Insertion_Sort 
{
    public static void isInsertion(int arr[], int n)
    {
        for(int i = 1; i < n; i++)
        {
            int temp = arr[i];

            int j = i;
            for(; j > 0; j--)
            {
                if(arr[j-1] > temp)
                {
                   arr[j] = arr[j-1] ;
                }
                else{
                    break;
                }
            }
            arr[j] = temp;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) 
    {
        int arr[] = {5,1,6,2,4,3};
        int n = arr.length;

        isInsertion(arr, n);
    }
}
