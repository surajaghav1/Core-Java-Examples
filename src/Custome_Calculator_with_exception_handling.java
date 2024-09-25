import java.util.Scanner;

import static java.lang.System.exit;

class exception extends Exception{
    @Override
    public String toString() {
        return "Please enter correct choice ";
    }
}
public class Custome_Calculator_with_exception_handling {
    public static void main(String[] args) {
        float a,b,ans;
        int choice;
        Scanner scan =new Scanner(System.in);

        boolean reply=true;
        while (reply){
            System.out.println("Enter two numbers ");
            a=scan.nextFloat();
            b=scan.nextFloat();
            System.out.println(" 1.Addition\n2.Subtraction\n 3.Division \n 4.Multiplication Enter your choice ");
            choice= scan.nextInt();
            switch (choice){
                case 1:
                    ans=a+b;
                    System.out.println("The addition of "+a+"and "+b+" is : "+ans);
                    break;
                case 2:
                    ans=a-b;
                    System.out.println("the substraction is : "+ans);
                    break;
//                    if(a<b){
//                        System.out.println("first number must be greater than second");
//                    }
                case 3:
                    if(b<=0) {
                        System.out.println("Number(dividend ) must greater than 0 ");

                        try {
                            ans = a / b;
                            System.out.println("wrong output : "+ans);
                        }
                        catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    }
                    else{
                        ans=a/b;
                            System.out.println("The Division of two numbers is : "+ans);
                        }

                    break;
                case 4:
                    if(a<=1000 && b<=500) {
                        ans = a * b;
                        System.out.println("multipliction of two numbers is : " + ans);
                    }
                    else
                    {
                        try {
                            ans=a*b;
                            System.out.println("This is not compatible : ans : "+ans);
                        }
                        catch (Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    exit(0);
                    break;
            }
            System.out.println("you want to repeat this process : ");
            System.out.println("enter your choice 'true' for yes and 'false' for No");
            reply=scan.nextBoolean();
        }
    }
}
