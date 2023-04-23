package Practice_Program;

public class Duplicate__01 
{
    public static void isDuplicate(int arr[], int size)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i]==arr[j])
                {
                    int n = arr[i];
                    System.out.println(n);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,1,5,4};
        int size = arr.length;
        isDuplicate(arr, size);
    }
}