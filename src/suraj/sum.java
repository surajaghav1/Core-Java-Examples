package suraj;

class sum_of_2Numbers extends demo{
void sumofNumbers(){
    System.out.println("The sum of x and y is "+super.x);
}
}
public class sum {
    public static void main(String[] args) {
        sum_of_2Numbers s=new sum_of_2Numbers();
        s.sumofNumbers();

        System.out.println("THis is new class of 'suraj' package");
//        s.greet();
    }
}

