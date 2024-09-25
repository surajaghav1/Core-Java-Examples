public class varagrs {

/*   varargs :
        This is argument is used in the function calling
        It is use instead of function overloading
        ***** WE can pass any no. of arguments at a time by using single parameter

*******  syntax :
                data_type function_name( data_type ...variable name){
                        function body;
                        }
      */
    static int sum(int ...arr){
        int result=0;
        for (int val:arr){
            result+=val;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 1,32,443 is : "+sum(1,23,443));
        System.out.println("the sum of 1,30,43 is : "+sum(1,30,43));
        System.out.println("the sum of 1,30,43,87,45,66 is : "+sum(1,30,43,87,45,66));
        System.out.println("the sum of 1,30,43,,15,30 is : "+sum(1,30,43,15,30));
        System.out.println("the sum of 11,3,44is : "+sum(11,3,4));

    }
}
