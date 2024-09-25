public class user_defined_methods {
    public int sum(int a,int b ){
        return a+b;
    }
//    public : when we use the public then we need to use object of class
//       class_name object =new class_name();

  static String greet(String name){
//        System.out.println("Hello Mr/Ms : "+name);
            String s="Hello Good Day "+name;
            return s;
    }
//    static : when we use static then we NOT need to create Objects of class
//    we can directly Call the function =>>  function_name(argument list);

    public static void main(String[] args) {
        System.out.println("function Calling ");
        System.out.println(greet("suraj"));

//        create object for public methods =>>
        user_defined_methods obj=new user_defined_methods();
        int ans=obj.sum(10,22);
        System.out.println("The sum of a and b is : "+ans);
    }
}
