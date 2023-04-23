package Swap;

public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=40;
        int d=18;
        int temp=400;
        System.out.println("Before swaping the numbers");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(temp);

        temp=a;
        a=d;
        d=b;
        b=c;
        c=d;
        d=temp;
        System.out.println("After swaping the numbers");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(temp);

    }
}
