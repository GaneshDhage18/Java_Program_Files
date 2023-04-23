import java.util.Scanner;
class Driver5
{
    public static void main(String[] args) 
    {
        Baby b1 = new Baby();
        Baby b2 = new Baby();
    }
}

class Baby
{
    String gender;
    double weight;
    {  // Non Static Initializer

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the gender and weight");
        String gender = s.next();
        double weight = s.nextDouble();
        System.out.println("The gender is "+gender);
        System.out.println("The weight is "+weight);
        s.close();
    }
}