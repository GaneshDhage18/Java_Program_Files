import java.util.Scanner;

public class Lineararray 
{
    public static boolean isLinear(int arr[], int key)
    {
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        int arr[] = {-1,22,-2,4,9,-3,12};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = s.nextInt();

        boolean found = isLinear(arr, key);

        if(found)
        {
            System.out.println("Key is present");
        }
        else
        {
            System.out.println("Key is absent");
        }
        s.close();
    }
}
