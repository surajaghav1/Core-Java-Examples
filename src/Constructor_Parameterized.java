class demo{
    int a,b;
    demo(int x,int y)
    {
        a=x;
        b=y;
    }
    public void dis()
    {
        System.out.println("Value of a and b is : "+a+" : "+b);
        System.out.println("sum is "+(a+b));
    }
}
public class Constructor_Parameterized {
    public static void main(String[] args) {

        demo d=new demo(10,33);
        d.dis();
    }
}
