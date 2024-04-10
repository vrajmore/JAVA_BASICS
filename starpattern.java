
import java.util.Scanner;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>0; i--){
            System.out.print("\n");
            for (int j=0; j<i; j++){
                System.out.print("*");
            }

        }
    }
}
