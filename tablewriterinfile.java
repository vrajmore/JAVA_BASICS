import java.io.FileWriter;
import java.io.IOException;

public class tablewriterinfile {
    public static void main(String[] args) {
        int i =0;
        int table = 5;
        int answer=0;
        String tabp;

        try {
            FileWriter fw = new FileWriter("tables.txt");
            for (i=1; i<=10; i++){

                answer = table*i;
                System.out.println(table+"X"+i+"="+ answer);
                tabp =+ table +"X"+i+"="+answer;
                fw.write(tabp);
                fw.write("\n");
            }

            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}
