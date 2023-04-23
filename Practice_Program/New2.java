package Practice_Program;

public class New2 
{
    public static void occurance(int arr[],int size)
    {
        int count = 1;
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
               
            }
        }

        for(int i = 0; i < size;)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] == arr[j])
                count++;
            }
            int temp = i;
            i = i+count;
            System.out.println(arr[temp]+"-- > Occurance is --> "+count);
            count = 1;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,5,7,2,1,8,7,7,8};
        int size = arr.length;
        occurance(arr,size);
    }
}
