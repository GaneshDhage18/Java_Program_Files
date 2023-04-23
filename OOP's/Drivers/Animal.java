public class Animal 
{
    static int num;
    String color;
    int age;

    public void Animal(String a, int b)
    {
        color = a;
        age = b;
    }

    void display()
    {
        System.out.println(color+" "+age);
    }
}

class main
{
    public static void main(String[] args) {
        Animal an = new Animal();

        // an.Animal("Black", 18);
        // an.display();

        Animal.num = 10;
    }
}
