import java.util.Scanner;
//import java.util.*;    //we can also use like this
//import java.lang.String;
/*
packages :
        Packages is a collection of classes,interface,sub-packages
        ** two types of packages **
        1.Built in packages
        2. User defined packages
        There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc
    ex :
        java.util.lang;
        java.util.Scanner;
        java.util.*  //=> it will return all classes from packages of util
 */
public class packages_predefined {
    public static void main(String[] args) {
        System.out.println("Enter value ");
        Scanner scan =new Scanner(System.in);   //it is class of java.util.Scanner packages
        byte a=scan.nextByte();    //byte is smaller than int
        System.out.println("Value is "+a);
    }
}
