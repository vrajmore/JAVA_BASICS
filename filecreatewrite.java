import java.io.*;
import java.util.Scanner;

public class filecreatewrite {
    public static void main(String[] args) {



        File file= new File("fx.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter fw = new FileWriter(file);
            fw.write("hey guys how are you");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String fl = sc.nextLine();
                System.out.println(fl);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        if (file.delete()){
            System.out.println("file deleated");
        }else {
            System.out.println("file does not exist");
        }



    }
}
