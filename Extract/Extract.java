package Extract;

public class Extract {
    public static void main(String[] args) {
        int num = 123;

        while(num>0)
        {
            int res = num%10;
            System.out.print(res);
            num=num/10;
        }
    }
}
