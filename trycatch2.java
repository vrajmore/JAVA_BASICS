import java.util.Scanner;

public class trycatch2 {
    public static void main(String[] args) {


        int[] marks = new int[3];

        marks[0]=52;
        marks[1]=56;
        marks[2]=82;



        Scanner sc = new Scanner(System.in);

        boolean help = true;

        while(help) {
            try {
                System.out.println("enter index value of marks");
                int ind = sc.nextInt();
                System.out.println("you selected the marks = " + marks[ind]);
                help = false ;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index out of bound");
                System.out.println(e);
                System.out.println("enter a valid index number");
                System.out.println();
            }
        }
    }
}
