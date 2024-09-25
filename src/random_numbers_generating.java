import java.util.Random;
import java.util.Scanner;

public class random_numbers_generating {
    public static void main(String[] args) {
        Random random=new Random();
//        Scanner scan=new Scanner(System.in);

//        random no generating
        System.out.println(random.nextFloat());
        int ran=random.nextInt(0,10);
        System.out.println("new no : "+ran);
        int d=random.nextInt(10,15);
        System.out.println("new no ; "+d);
    }
}
