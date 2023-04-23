package BinarySearch;


public class Pivot
{
    public static int firstOcc(int arr[], int n)
    {
        int s = 0;
        int e = n-1;
       

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] > arr[mid+1])
            {
               s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e - s)/2;
        }
        return s;
    }
    
    public static void main(String[] args) 
    {

        int arr[] = { 7, 8, 9, 3, 6};
        int n = arr.length;
       
        Pivot p = new Pivot();
        //p.firstOcc(arr, n);
        System.out.println(p.firstOcc(arr, n));
    }
}