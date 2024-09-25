import java.util.Scanner;

//class :
// we can define class outside of main class by using class keyword
//we can not specify the class as  public
class Employee{
    int id;
    String name;
    float salary;
    public void getdata(int ID,String nm,float sal){
        id=ID;
        name=nm;
        salary=sal;
    }
    public void printData(){
        System.out.println("ID is : "+id);
        System.out.println(" Name is : "+name);
        System.out.println("Salary is : "+salary);
    }
   public void ff(String name)
    {
        System.out.println("name s : "+name);
    }
}

public class user_defined_Class {


    public static void main(String[] args) {

        Employee emp=new Employee();
        Scanner scan =new Scanner(System.in);
        System.out.print("enter id : ");
        int id=scan.nextInt();
        System.out.print("Enter name of employee : ");
        String name=scan.nextLine();
        System.out.println(name);
        emp.ff(name);
        System.out.print("Enter salary in floating point");
        float salary=scan.nextFloat();

        emp.getdata(id,name,salary);
        emp.printData();

    }
}
