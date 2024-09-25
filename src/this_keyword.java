class demo1 {
    int a,b;
    public void get(int a,int b)
    {
//        This pointer is used to access data members of same class
        this.a=a;
        this.b=b;
    }
    public  void display(){
        System.out.println("This is demo"+this);
        System.out.println("This is a : "+a);
        System.out.println("This is b : "+b);

    }
}
public class this_keyword {

    public static void main(String[] args) {
        demo1 d=new demo1();
        d.get(10,20);
        d.display();

    }
}
