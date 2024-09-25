import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
File () :
        this class used to creating file and gives the name or path in the file("abc.txt");
 file_object.createNewFile() :
                this is used to create file
 */
public class file_handling {
    public static void main(String[] args) {

//for creating new file (empty file )
        File f=new File("suraj.txt");
        try {
            f.createNewFile();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Can not create file ");
        }

//        for writing the content on the file

//        try {
//        FileWriter fileWriter=new FileWriter("suraj.txt");
//        fileWriter.write("Hii this is my first file content\n");
//        fileWriter.write("Hii 2nd line of the file ");
//        fileWriter.close();
//        }
//        catch (Exception e){
//                System.out.println(e);
//                System.out.println("can not write on file ");
//            }

//        reading from a file
        File myfile=new File("suraj.txt");

        try {
        Scanner scan=new Scanner(myfile);
            while (scan.hasNextLine())
            {
                String line= scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("File not found for reading ");
        }

//        deleting the file
        File deltefile=new File("suraj.txt");
        if(deltefile.delete()){
            System.out.println("file deleted successfully ");
        }
        else {
            System.out.println("File Not deleted ");
        }

    }
}
