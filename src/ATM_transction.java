import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

/*
ATM :
    1.check balance
    2.withdraw
    3.deposite
    4.mini statement
    5.update
    6.register
 */
interface myATM{
    void register();
    void checkBalance();
    void Withdraw(int amt);
    void deposite(int amt);
    void miniStatement();
    void update();
}
class ATM implements myATM{
    double moNo,accno;
    int pin,otp;
    float useramt=0;
    String name;
    Scanner scan=new Scanner(System.in);
    Random OTP=new Random(10);
    Calendar c=Calendar.getInstance();
    @Override
    public void register(){
        System.out.println("Enter your name ");
        name= scan.nextLine();
        System.out.println("Enter Account number ");
        accno=scan.nextDouble();
        System.out.println("Enter Mobile number : ");
        moNo=scan.nextDouble();
        otp= OTP.nextInt();
        System.out.println(otp);
        System.out.println("Enter otp : ");
        int userOTP=scan.nextInt();
        if(userOTP==otp){
            System.out.println(" OTP Authentication Successfully ");
            System.out.println("Your registeration complete ");
        }
        else {
            System.out.println("Wron OTP !! Please enter write once ");
        }
    }
    @Override
    public  void checkBalance(){
        System.out.println("Your Balance in account is : Rs."+useramt);
    }
    @Override
    public   void Withdraw(int amt){
        if(amt<useramt){
            useramt=useramt-amt;
            System.out.println("Amount withdrawl successfully : "+amt);
            System.out.println("Available Balance in your account is : "+useramt);
        }
        else{
            System.out.println("Not Sufficient money in your account ");
        }
    }
    @Override
    public  void deposite(int amt){
        useramt+=amt;
        System.out.println("Amount deposited in account successfully ");
    }
    @Override
    public  void miniStatement(){
        System.out.println("*********\t Mini Statement \t *********");
        System.out.println("Available Balance in your account : "+useramt);
        System.out.println("Account no : "+accno);
        System.out.println(c.getTime());
    }
    public  void update(){

    }

}

public class ATM_transction {
    public static void main(String[] args) {
        boolean flag=true;
//        wamt => Withdrawal amount
//        damt => Deposited amount
        int choice,wamt,damt;
        ATM atm=new ATM();
        Scanner s=new Scanner(System.in);
        while (flag){
            System.out.println("Welcome to ATM ");
            System.out.println("1.Register \n2.Withdraw \n3.Deposit\n4.Check Balance\n5.Mini Statement\n6.Exit");
            System.out.println("Choose your choice ");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    atm.register();
                    break;
                case 2:
                    System.out.println("Enter amount which you want to withdraw ");
                    wamt=s.nextInt();
                    atm.Withdraw(wamt);
                    break;
                case 3:
                    System.out.println("Enter amount to be deposited in your account ");
                    damt=s.nextInt();
                    atm.deposite(damt);
                    break;
                case 4:
                    atm.checkBalance();
                    break;
                case 5:
                    atm.miniStatement();
                    break;
                case 6:
                    exit(0);
            }
        }
    }
}
