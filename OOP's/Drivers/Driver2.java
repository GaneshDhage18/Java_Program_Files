class DreamJob
{
    double salary;
    String position;
    String name;
}
public class Driver2 
{
    public static void main(String[] args) {
        DreamJob d1 = new DreamJob();
        d1.salary = 40000;
        d1.position = "Software Developer";
        d1.name = "TCS";

        DreamJob d2 = new DreamJob();
        d2.salary = 45000;
        d2.position = "Software Developer";
        d2.name = "Accenture";

        System.out.println("Properties of 1st DreamJob is:");
        if(d1.salary % 2 == 0)
        {
            System.out.println("you're on even salary");
        }
        else
        {
            System.out.println("you're on odd salary");
        }
        System.out.println(d1.position);
        System.out.println(d1.name);

        System.out.println();
        System.out.println("Properties of 2nd DreamJob is:");
        if(d2.salary % 2 == 0)
        {
            System.out.println("You're on even salary");
        }
        else
        {
            System.out.println("you're on odd salary");
        }
        System.out.println(d2.position);
        System.out.println(d2.name);
    }
}
