import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

//       ****** Getting user input by using Scanner() method/class  *******
   Scanner scan=new Scanner(System.in);

//       for string input nextLine() :
        System.out.println("Eneter string  : ");
        String x=scan.nextLine();
//        nextLine() =>  it return whole line this function is used to get user input in String/ text format
//        next() => it return only single word
        System.out.println(x);
        System.out.println("Enter new value : ");
        x=scan.next();
        System.out.println(x);

//        for integer input value : nextInt() =>
        System.out.println("Enter the integer value : ");
        int num=scan.nextInt();
        System.out.println("you entered value : "+num);

//        for double input value : nextDouble() =>
        System.out.print("Enter double value /decimal value : ");
        double d=scan.nextDouble();
        System.out.println("You entered Double value is : "+d);

//        for floating point value : nextFloat() =>
        System.out.print("Enter the floating poing value : ");
        float f=scan.nextFloat();
        System.out.println("You entered float value : "+f);

    }
}
