import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to ROCK, PAPER, SCISSOR");

        System.out.println("enter rock ,paper, scissor for hand 1");
        String h1 = sc.next();
        System.out.println("enter rock ,paper, scissor for hand 2");
        String h2 = sc.next();

        if (h1 == "rock" || h2 == "scissor") {
            System.out.println("hand 1 won");
        } else {
            if (h2 == "paper") {
                System.out.println("hand 2 won");
            } else {
                System.out.println("hand 1 won");
            }
        }


        if (h1 == "paper" || h2 == "rock") {
            System.out.println("hand 1 won");
        } else {
            if (h2 == "scissor") {
                System.out.println("hand 2 won");
            } else {
                System.out.println("hand 1 won");
            }
        }

        if (h1 == "scissor" || h2 == "paper") {
            System.out.println("hand 1 won");
        } else {
            if (h2 == "rock") {
                System.out.println("hand 2 won");
            } else {
                System.out.println("hand 1 won");
            }
        }


    }
}
