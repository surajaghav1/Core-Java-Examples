package Java_Assignment;

import java.util.Arrays;

//3. How do you find the second largest number in an array in Java?
public class Ques_3 {
    public static void main(String[] args) {
        int arr[]={1,55,35,44,65,20};
        System.out.println("Original array ");
        for(int i:arr){
            System.out.println(i);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }

        System.out.println("reversed ");
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println("second max : "+arr[arr.length-2]);

    }
}
