
public class try_catch_block {
public static void main(String[] args){
    int a=1254;
    int  b=0;
//    int b=10;
    int c;
//    with out try block
//    System.out.println("Without exception (try block) answer is : "+c);

            try {
                c=a/b;
                System.out.println("The answer with try block : "+c);
            }
            catch(Exception e){
                System.out.println("You entered invalid choice : "+e);
                System.out.println(e);
            }
}
}
