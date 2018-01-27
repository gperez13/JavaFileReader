import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args){

        java.io.File file = new java.io.File("ThisFile.txt");
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String num = input.nextLine();
                System.out.println(num);
            }
        }




        catch (FileNotFoundException e) {
            System.err.format("File Does Not Exist/n");
        }

    }











}
