class Student1 {
    private int id;
    private double per;

    Student1(double per, int id) {
        this.id = id;
        this.per = per;
    }

    public int getid() {
        return id;
    }

    public void setper(double per) {
        if (per > 0) {
            this.per = per;
        }
    }

    public double getper() {
        return per;
    }
}
    public class Hiding 
{
    public static void main(String[] args) 
    {
        Student1 s1 = new Student1(65, 17);
        System.out.println(s1.getid());
        System.out.println(s1.getper());

        s1.setper(70);
        System.out.println(s1.getper());
        
        s1.setper(-70);
        System.out.println(s1.getper());
    }    
}
