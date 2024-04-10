import java.util.Scanner;

public class Reverse_string_and_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.nextLine());
        System.out.println("normal string is "+a);
        StringBuilder sb = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        System.out.println("reversed string is "+sb);

        // for palindrome

        if (a.equals(sb.toString())){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
