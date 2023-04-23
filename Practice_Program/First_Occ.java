package Practice_Program;
//import java.util.Arrays;

public class First_Occ 
{
    public static int pivot (int arr[], int n)
    {
        int s = 0;
        int e = arr.length-1;;
        

        int mid  = s + (e -s)/2;

        while(s < e)
        {
            if(arr[mid] > arr[mid+1])
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

   public static void main(String[] args) 
   {
       int arr[] = { 9, 2, 3, 7, 10};
       
       System.out.println(pivot(arr, 5));
   }
}
