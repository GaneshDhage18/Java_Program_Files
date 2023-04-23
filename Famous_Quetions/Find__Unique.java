package Famous_Quetions;

public class Find__Unique 
{
    public static void isUnique(int arr[], int n)
    {
        int count = 1;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count <=1)
            {
               System.out.println(arr[i]);
               break;
            }
            count = 1;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,7,4,2,4,1};
        int n = arr.length;
        isUnique(arr, n);
    }
    
}
