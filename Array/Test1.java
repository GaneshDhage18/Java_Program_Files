import java.util.Scanner;;
public class Test1 
{
        public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No:");
        int num = s.nextInt();

        String[] name = {"Sanvi", "Siri", "Neha", "Roshan"};

        for(int i = 0; i <= name.length; i++)
        {
            if(num == i)
            {
                System.out.println(name[i-1]);
            }
        }
    }
}
