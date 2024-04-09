import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("total odd numbers you want to print");
        int a = sc.nextInt();


        for (int i=0; i<a; i++){
            System.out.println(2*i+1);
        }
    }
}






