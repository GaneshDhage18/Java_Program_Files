package Famous_Quetions;

public class Array_Intersection 
{
    public static void main(String[] args) 
    {
        int arr1[] = {8, 1, 2, 3, 4};
        int arr2[] = {2, 4, 6, 8, 5};
    
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    int same = arr1[i];
                    System.out.println(same);
                }
            }
        }
    }
   
}
