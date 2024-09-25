import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ard=new ArrayDeque<>();

//        by default element add at last
        ard.add(10);
        ard.add(15);
        ard.add(100);
        ard.add(250);
        ard.add(30);
        System.out.println(ard);

//        remove the first element from an array
        ard.pop();
        System.out.println(ard);

//        add element at first in array
        ard.push(1000);
        System.out.println(ard);

//        add element at first
        ard.addFirst(100);
        System.out.println("Adding elemetn at first : "+ard);
//        add element at last
        ard.addLast(5454);
        System.out.println("Adding element at last : "+ard);

//
    }
}
