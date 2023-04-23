package Abstraction;

    interface Animal
    {
        public void animalSound();
        public void sleep();
    }

    // pig "implements" the animal interface
    class pig implements Animal
    {
        public void animalSound()
        {
            System.out.println("The pig says: wee wee");
        }
        public void sleep()
        {
            // The body of sleep is provided here
            System.out.println("Zzzzz");
        }
    }

    public class Interface 
{
    public static void main(String[] args) 
    {
        pig myPig = new pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
