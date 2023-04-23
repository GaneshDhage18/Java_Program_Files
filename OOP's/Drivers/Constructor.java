
class Demo
{
    String name;
    int emp_id;

    Demo(String name, int emp_id)
    {
        this.name=name;
        this.emp_id = emp_id;
    }
}

public class Constructor 
{
    public static void main(String[] args) 
    {
        Demo d1 = new Demo("Adam",10);

        System.out.println(d1.name+" "+d1.emp_id);
    }
}
