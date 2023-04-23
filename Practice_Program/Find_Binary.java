package Practice_Program;

public class Find_Binary 
{
    public static int isBinary(int arr[], int size, int key)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] >= arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for(int i=0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int start = 0;
        int end = size-1;

        int mid = start + (end - start)/2;
        while(start <= end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
            if(key >= arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid-1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,9,4,6,3,2,8,-1};
        int size = arr.length;
        System.out.println( isBinary(arr, size, -1));
    
    }
}
