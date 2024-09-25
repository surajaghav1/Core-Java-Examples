import java.util.Scanner;

public class math_functions{
    public static void main(String[] args){

//        Math functions :
        int n1=100,n2=32;
        System.out.println("Maximum number from n1 and n2 : "+Math.max(n1,n2));
        System.out.println("Minimum number from n1 and n2 : "+Math.min(n1,n2));
        System.out.println("Square root of n1 is : "+Math.sqrt(n1));
        System.out.println("Square root of n2 is : "+Math.sqrt(n2));
        System.out.println("Absolute value of -122.32 is : "+Math.abs(-122.32));

//        Math.random() => this function returns the random numbers between 0 to 1
        System.out.println("Random number between 0.0 to 1.0 : "+Math.random());
        System.out.println("Random numbers between 1 to 100 : "+Math.random()*100);
        System.out.println("random number between 4 to 8 : "+(4+(8-4)*Math.random()));
        System.out.println("random number between 4 to 8 : "+(4+(8-4)*Math.random()));
        System.out.println("random number between 4 to 8 : "+(4+(8-4)*Math.random()));



//        Use of math function with user input
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=scan.nextInt();
        System.out.println("You entered number is : "+num);
        System.out.println("Square root of given number : "+Math.sqrt(num));
    }
}
