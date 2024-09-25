import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(22);
        l1.add(32);
        l1.add(50);
        for (int i:l1)
        {
            System.out.println(i);
        }

//        adding element at first and last
        System.out.println("adding element at last ");
        l1.addLast(1001);
        System.out.println(l1);
        System.out.println("Adding element at first ");
        l1.addFirst(5000);
        System.out.println(l1);

//        getting first and last element from the linkedlist
        System.out.println("First element of linked list : "+l1.getFirst());
        System.out.println("Last element of linked list : "+l1.getLast());
//        for removing element remove() function used

        System.out.println("The first element remove : "+l1.remove(0));
        System.out.println("After removing element ");
        System.out.println(l1);
//        System.out.println("get first element : "+ l1.getFirst());
//        System.out.println("Get last elemetn ; "+l1.getLast());

    }
}
