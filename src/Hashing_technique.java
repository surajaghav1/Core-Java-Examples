import java.util.HashSet;
/*
hashing technique :
                it will store on the index x%10=index
                hashset.add(100);
                100 % 10 =10
 */
public class Hashing_technique {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>(6,0.6f);
//        it can not print double/ same value again
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(32);
        hashSet.add(2);
        hashSet.add(20);
        hashSet.add(15);
        hashSet.add(153);
        System.out.println(hashSet);
    }
}
