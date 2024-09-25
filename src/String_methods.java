import java.util.Scanner;

public class String_methods{
    public static void main(String[] args){

//        Getting string from user to perform actions on it
        Scanner scan=new Scanner(System.in);

        System.out.println("enter your string : ");
//        first string ;
        String s=scan.nextLine();
        System.out.println("String you entered : ");
        System.out.println(s);
        System.out.println("Length of string is : "+s.length());
        System.out.println("String in Upper Case : ");
        System.out.println(s.toUpperCase());
        System.out.println("The string in Lower case ");
        System.out.println(s.toLowerCase());
//        second string ;
        String s2="Hello Good Day !! Its a beautiful Day";
        System.out.println("By default string is : ");
        System.out.println(s2);
        System.out.println("index of Day ");
//        indexOf("string") => it return index of string at first occurance
        System.out.println(s2.indexOf("Day"));

//        string Concatenation :
//             1=> by using (+) plus operator
//              2=> by usning concat() method /function

//        System.out.println("String Concatenation of s1 and s2 ");
//        System.out.println(s+s2);
//        System.out.println(s.concat(s2));

//        contains() => This return true if any string is present in given text
        System.out.println(s2.contains("Day"));

//        charAt(index number) => it return character at given index
        System.out.println(s2.charAt(15));

//        endsWith(string) => it return true if  text ends with given string
        System.out.println(s2.endsWith("ay"));
    }

}
