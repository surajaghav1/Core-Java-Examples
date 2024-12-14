package Java_Assignment;

//4. How do you get distinct characters and their count in a string in Java?
public class Ques_4 {
    public static void main(String[] args) {
        String str = "surajjs";
        System.out.println("original : "+str);
        for (int i = 0; i<=str.length()-1; i++) {
            char ch=str.charAt(i);
            for (int j=i+1;j<=str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j) ){
                    System.out.println("duplicate\t"+ch);
                    break;
                }
            }
        }
    }
}
