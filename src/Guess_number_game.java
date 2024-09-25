//Game of guessing the numbers

import java.util.Random;
import java.util.Scanner;

class game{
private int x,userinput;
private int noOFguess=0;
    game(){
        Random random=new Random();
        this.x=random.nextInt(0,50);
    }
    public void get(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no you want ");
        userinput=scan.nextInt();
    }
    public boolean check(){
        if(userinput==x){
            noOFguess+=1;
            System.out.println("You win !! Guess in moves : "+noOFguess);
            return true;

        }
        else if(userinput>x) {
            System.out.println("Too High pleas enter low number ");
            noOFguess+=1;
         }
        else if(userinput<x)
        {
            System.out.println("Too low please select high number");
            noOFguess+=1;
        }
        else {
            System.out.println("Wrong choice !! please enter write choice !");
            noOFguess+=1;
        }
      return false;
    }
}

public class Guess_number_game {
    public static void main(String[] args) {
            game g=new game();
          boolean a=false;
        while (!a){
            g.get();
            a=g.check();
                }
    }
}
