public class Loop {
    public static void main(String[] args){

//        for loop
        for (int i=0;i<10;i++)
        {   if(i==5)
            continue;
//            break;

            System.out.println(i);

        }

//        While loop : =>it is entry controlled loop
        int j=1;
        while (j<=10)
        {
            System.out.println("num is : "+j);
            j++;
        }


//        do while loop : => it execute at least once if condition gets falls/fails
        int k=0;
        do {
            System.out.println(k);
            k++;
        }while (k>10);
    }
}
