package Java_Assignment;

//5.  How to Find two maximum numbers in array in one iteration in java ?
public class Ques_5 {

        public static void main(String[] args) {
            int arr[]={10,25,32,4,5,78};
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

            System.out.println("reversed array ");
            for(int i:arr){
                System.out.println(i);
            }

            System.out.println("max : "+arr[arr.length-1]);
            System.out.println("second max : "+arr[arr.length-2]);

        }
    }
