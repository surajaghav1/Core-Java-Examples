public class method_overloading {
static int sum(int a,int b){
    return (a+b);
}
static int sum(int a,int b,int c){
    return a+b+c;
}
static int sum(int a,int b,int c,int d){
    return a+b+c+d;
}
public static void main(String[] args){
    System.out.println("Sum of 10 and 22 : "+sum(10,22));
    System.out.println("Sum of  20" +"12" +"233 "+sum(20,12,233));
    System.out.println("Sum of 50, 15 32 45 : "+sum(50,15,32,45));
}
}
//method overloading :
//      it is process of defining a method with same name and different parameters/arguments