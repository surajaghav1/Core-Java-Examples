public class Array {
    public static void main(String[] args){

//Array : => it is collection of elements of same data type
//        int [] marks={10,2,33,};
        int [] marks={100,50,72,45,55};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[2]=80;
        System.out.println("Updated Value at index 2 : "+marks[2]);

//        Traverse array through for loop
            for (int i=0;i<marks.length;i++)
            {
                System.out.println("value at index : "+i+" is : "+marks[i]);
            }

//            Traverse array through For Each loop
        for(int value:marks){
            System.out.println(value);
        }

//        Multi Dimensional Array

        int [][]matrix={{1,2,3},{4,5,6}};
        System.out.println(matrix[0][1]);

//        String Array :
        String [] model ={"BMW","Mercides","Audi","Volvo","Tata"};
        for (String val:model)
        {
            System.out.println("Model : "+val);
        }
    }
}
