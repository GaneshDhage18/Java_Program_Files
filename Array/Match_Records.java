public class Match_Records 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 1, 2, 5, 8, 5};
       
      
        for(int i = 0; i <= arr.length-1; i++)
        {
            for(int j = i+1; j <= arr.length-1; j++)
            {
                if(arr[i] == arr[j])
                {
                    int match = arr[i];
                    System.out.println(match);
                }
            }
        }
    }
}
