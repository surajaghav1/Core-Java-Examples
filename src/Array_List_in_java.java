import java.util.*;

public class Array_List_in_java {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
//        for adding element to the list add() method is used
        list.add(22);
        list.add(33);
        list.add(30);
        list.add(100);
        list.add(45);
        System.out.println("Printing list with sout ");
        System.out.println(list);
        System.out.println("Printing list with for loop ");
        for (int i:list){
            System.out.println(i);
        }

//        we can add element at list at specific index using add(index,value);
        list.add(0,10);
        System.out.println(list);
        ArrayList<Integer> list3 =new ArrayList<Integer>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        System.out.println("list 3 is : ");
        System.out.println(list3);
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("suraj");
        list2.add("Ram");
        list2.add("Sachin");
        System.out.println(list2);

//        for adding new one list to existing list addAll()
//        addAll() : => it will add the element at the last/ append at last by default
        list.addAll(list3);
        System.out.println(list);
//        if you want to add list at first then specify that addAll(0,list);
        list.addAll(0,list3);
        System.out.println(list);

        int a=list.remove(1);
        System.out.println("deleted element +"+a);

//        contains() : this is used to check list contain any given element
//        indexOf() : This return index of value first occurrence value  , indexOf(value);
//        lastIndexOf() : it return index of last occurrence value
        System.out.println("it checks 100 in list "+list.contains(100));
        System.out.println("The index of 100 : "+list.indexOf(100));
        System.out.println("The last index of 100 : "+list.lastIndexOf(100));

//        clear() : used to clean/ clear the whole list .
//        list.clear();
//        System.out.println(list);

//        size() : this return size of list
//        get() : this used to get element at index , get(index)
        for(int i=0; i<list.size();i++)
        {
            System.out.println("The value : "+list.get(i)+" index : "+i);
        }
    }
}
