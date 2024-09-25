import java.util.Scanner;

public class if_else {
    public static void main(String[] args){

//        if  else condition
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age");
        int age=scan.nextInt();
        System.out.println("Your age is : "+age);

        if(age<=10){
            System.out.println("You are a kid !!");
        }
        else{
            System.out.println("You are not a kid !");
        }

//        if else_if else  ladder :

        if( age<10){
            System.out.println("You are in nursery");
        }
        else if(age>=10 && age<=16){
            System.out.println("You are in school : ");
        }
        else {
            System.out.println("You are in Young Stage");
        }
    }
}
