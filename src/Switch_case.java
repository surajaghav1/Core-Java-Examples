import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){

//        Switch case :
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Birthday  Day of week");
        String Day=input.nextLine();
        System.out.println("Your Day is : "+Day);

        switch (Day)
        {
            case "monday":
                System.out.println("You Born on Monday !! its a Good Day for you !!");
                break;
            case "tuesday":
                System.out.println("You Born on Tuesday !!");
                break;
            case "wednesday":
                System.out.println("You Born on 'wednesday' !!");
                break;
            case "thursday":
                System.out.println("You Born on 'thursday' !!");
                break;
            case "friday":
                System.out.println("You Born on 'friday' !!");
                break;
            case "saturday":
                System.out.println("You Born on Saturday !!");
                break;
            case "sunday":
                System.out.println("You Born on Sunday  !! Its a Fun Day ");
                break;
            default:
                System.out.println("Wrong  Choice ");
                break;
        }

    }
}
