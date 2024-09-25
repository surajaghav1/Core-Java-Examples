/*
Interface :
        interface define by using "interface" keyword.
        This is like a class, but in which only method declaration and nothing defining
        in which only declare method and define/implements in class by using "implements" keyword.
 */
interface myself{
    public void personal();
    public void professional();
}

class biodata implements myself{
    public void personal(){
        System.out.println("I am suaj aghav. I am in TY of  my BCA educational journey");
    }
    public void professional(){
        System.out.println("I am basically software Engineer and  i designed software in many languages ");
    }
}
public class interface_intro {
    public static void main(String[] args){
        biodata b=new biodata();
        b.personal();
        b.professional();
    }
}
