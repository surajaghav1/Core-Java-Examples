package Java_Assignment;
//1 . Find Duplicate Elements in an Array

public class Ques_1 {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5,7};
        System.out.println("Original array ");
        for(int i:arr){
            System.out.println(i);
        }
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int count=0;
            for (int j=i;j<arr.length;j++){
                if(arr[j]==temp){
                    count++;
                }
                else if(count>=2){
                    System.out.println("dubplicate "+temp+" count : "+count);
                    break;
                }
            }
        }
    }
}
