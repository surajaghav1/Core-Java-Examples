package Java_Assignment;

import java.util.LinkedList;
import java.util.ListIterator;

//2. How do you reverse a linked list in Java?
public class Ques_2 {

    public static void main(String[] args) {
        LinkedList li=new LinkedList();
        li.add(1);
        li.add(2);
        li.add(20);
        li.add(78);
        li.add(55);

        ListIterator Iter=li.listIterator();

        System.out.println("Original List : "+li);
        while (Iter.hasNext()){
            System.out.print(Iter.next()+"\t\t");
        }
        System.out.println("\nReversed List ");
        while (Iter.hasPrevious()){
            System.out.print(Iter.previous()+"\t\t");
        }
    }
}
