package Practice_Program;
 import java.util.Arrays;  
class Sorting
{
    public static void main(String[] args) 
    {
        int arr[] = {6,1,8,2,5,4};
        int n = arr.length;

        // This is method is use to sort the array :)
          Arrays.sort(arr);

        for(int i = 0; i < n; i++)
        {
            // for(int j = i+1; j < n; j++)
            // {
            //     if(arr[i] > arr[j])
            //     {
            //         arr[i] = arr[i] + arr[j];
            //         arr[j] = arr[i] - arr[j];
            //         arr[i] = arr[i] - arr[j];
            //     }
            // }
            System.out.print(arr[i]+" ");
        }
    }
}