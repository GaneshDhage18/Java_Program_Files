public class Driver3 
{
    public static void main(String[] args) 
    {
        N1 n1 = new N1();  // Without crating an object we cannot access non static methods.
        n1.demo();
    }    
}
    class N1
    {
        public void demo() // Non Static method
        {
            System.out.println("Demo for N1");
        }
    }