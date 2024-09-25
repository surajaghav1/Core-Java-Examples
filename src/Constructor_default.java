
class bank{
    private int accno;
   private String name;
    private String addr;

//    Default Constructor : it invoked automatically when object created;
  public bank(){
        accno=100;
        name="suraj";
        addr="Anagar";
    }
    public void display(){
        System.out.println("Acc no : "+accno);
        System.out.println("Name : "+name);
        System.out.println("Adders : "+addr);
    }
}

public class Constructor_default {
    public static void main(String[] args) {
bank b=new bank();
b.display();
//b.accno=11;
//b.display();
    }
}
