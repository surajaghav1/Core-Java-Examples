public class try_catch {
    static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args){

//        Try catch :
//        This block is used to error handeling
        String []car={"TATA","Ashoka","Mahindra","Bugati"};
        for (String val:car)
        {
            System.out.println(val);
        }
//        System.out.println(car[4]);
//                  it got an error and code after this error not work

        try {
            System.out.println(car[4]);
        }
        catch (Exception e){
            System.out.println(e);
        }
// it returns error in plan text format
        System.out.println("Hello The try catch block end");

        System.out.println(sum(10,32));
    }
}
