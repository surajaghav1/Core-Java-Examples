import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter values ");
        Scanner s=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        for (int val: a)
        {
            System.out.println("val : "+val);
        }
        String name[]=new String[6];
        System.out.println("Enter character value ");
        for (int i=0;i<6;i++)
        {
            name[i]=s.next();
        }
        for (String n:name){
            System.out.println(" name "+n);
        }
    }
}
