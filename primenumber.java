import java.util.Scanner;

public class primenumber {
    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int p = sc.nextInt();


        System.out.print("prime number - ");
        for (int i = 0; i <= p; i++) {
            if (isprime(i)){
                System.out.print(i + " , ");
            }

        }

    }

}

