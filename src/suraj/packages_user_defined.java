/*
**** ACCESS MODIFIERS ***

Modifier	        Class	Package 	Subclass	World
public	              Y     	Y	        Y	      Y
protected             Y         Y	    	Y	      N
no modifier           Y	        Y	        N	      N
private               Y	        N	        N	      N

 */


package suraj;
 class demo{
    int x,y;

    void assign(){
        System.out.println("value is assign to ");
        this.x=10;
        this.y=22;
        System.out.println("The value of x is : "+this.x+" and y is "+this.y);

    }
}
public class packages_user_defined {
    public void greet(){
        System.out.println("Good Evening !!! This is demo class of Packages of 'suraj' ");
    }
    public static void main(String[] args) {
      demo d=new demo();
//      d.greet();
    d.assign();
    }
}
