public class Access_specifier {
     static class employee{
         private String name;
         private int id;
         private  float sal;
         public void get(String n,int d,float s){
             name=n;
             id=d;
             sal=s;
         }
         public void dispaly(){
             System.out.println("Nmae : "+name);
             System.out.println("Id id : "+id);
             System.out.println("Salary is :"+sal);
         }
     }
    public static void main(String[] args) {

         employee emp=new employee();

     /*    emp.name="suraj";
         emp.id=33;
         emp.sal=443.33f;
         ===>>>This can not be accessed because of Private access specifier used
         If we used private access specifier then we can not access properties or methods of class
      */


//        For that we use public access specifier for accessing the methods
        emp.get("suraj Aghav",100,434.32f);
        emp.dispaly();
    }
}
