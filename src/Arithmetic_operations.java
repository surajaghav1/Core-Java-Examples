import java.util.Scanner;

public class Arithmetic_operations {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number : ");
        float num1=scan.nextFloat();
        System.out.println("enter second number : ");
        float num2=scan.nextFloat();
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
        int choice=scan.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Addition of two numbers is : "+(num1+num2));
                break;
            case 2 :
                System.out.println("Substraction of two numbers "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers : "+(num1*num2));
                break;
            case 4:
                System.out.println("division of two numbers : "+(num1/num2));
                break;
            case 5:
                System.out.println("modulus of two numbers : "+(num1%num2));
                break;
            default:
                System.out.println("Wrong choice : ");
                break;
        }
    }
}
