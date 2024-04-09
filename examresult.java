import java.util.Scanner;


public class examresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("exam pass calculator");

        System.out.println("enter marks maths out of 100");
        int m = sc.nextInt();
        System.out.println("enter marks physics out of 100");
        int p = sc.nextInt();
        System.out.println("enter marks chemistry out of 100");
        int c = sc.nextInt();

        int total = (m+p+c);

        if (total>=120 && p>=33 && m>=33 && c>=33){
            System.out.println("you cleared the exam");
        }
        else{
            System.out.println("out failed the exam");
        }


    }
}