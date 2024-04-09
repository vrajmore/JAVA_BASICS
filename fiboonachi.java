import java.util.Scanner;

public class fiboonachi {

    static int fibo(int x){
        if (x==1){
            return 1;
        } else if (x==2) {
            return x-1;
        }
        else {
            return fibo(x-1) + fibo(x-2);
        }

    }

    public static void main(String[] args) {
        int a =10;


        int b=fibo(11);
        System.out.println(b);
    }
}
