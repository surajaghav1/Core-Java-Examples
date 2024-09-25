
/*
finally :
        this is keyword which is execute the code roughly/ hardly
 */
public class finally_block {
    static int demo(){

        System.out.println("Hello good morning ;");
        try{
            int i=55;
            int b=10;
            int c=i/b;
            return c;
        }
        catch(Exception e){
            System.out.println("Exception is "+e);
        }
        finally {
            System.out.println("This is end of file with finally ");
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(demo());
        System.out.println("end of program ");

    }

}
