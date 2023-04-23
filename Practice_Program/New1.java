package Practice_Program;
import java.util.Scanner;

public class New1
{
    public static void main(String[] args)
    {
        int arr[] = {6,5,4,3,2,1};
        int size = arr.length;
        pivot p = new pivot();

        int index = p.findPivot(arr, size);
        System.out.println(index);
    }
}

class pivot
{
    public int findPivot(int arr[], int size)
    {
        int s = 0;
        int e = size-1;

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] < arr[mid+1])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e - s)/2;
        }
        return s;
    }
}