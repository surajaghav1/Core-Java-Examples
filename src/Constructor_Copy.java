class copy{
    int a,b;
    copy(int x,int y) {
      a=x;
      b=y;
    }
    public void dis()
    {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }

    copy(copy obj)
    {
        a=obj.a;
        b=obj.b;
        System.out.println("value of a and b is : "+ a+" "+b);
    }
}
public class Constructor_Copy {
    public static void main(String[] args) {
        copy c=new copy(10,20);
        System.out.println("original values");
        c.dis();
        System.out.println("After copy constructor");
        copy c1=new copy(c);
        c1.dis();
    }
}
