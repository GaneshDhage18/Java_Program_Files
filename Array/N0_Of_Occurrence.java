public class N0_Of_Occurrence 
{
    public static void appearnce(int arr[],int n)
    {
        int count=1; 
        for(int i=0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
       
        for(int i=0; i < n;)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            int t=i;
            i=i+count;
            System.out.println(arr[t]+" = "+count);
            count=1;
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {9,1,4,1,4,4};
        int n = arr.length;

        appearnce(arr, n);
        

    }
}


