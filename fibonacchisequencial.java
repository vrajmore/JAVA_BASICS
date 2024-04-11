import java.util.Scanner;

public class fibonacchisequencial {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit to print fibonacchi series");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.print(a+", ");

            a = b;
            b = c;
            c = a+b;
        }
            System.out.println("");
    }
}
