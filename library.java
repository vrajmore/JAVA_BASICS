import java.util.Scanner;

interface Bicycle {
    void applyBrake ( int decrement );
    void  speedup ( int increment );
}

class Avoncycle implements Bicycle {

    int speed = 7;

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedup(int increment) {
        speed = speed + increment;
    }

}

class Lib{

    String [] book;
    int noofbooks=0;

    Lib(){
        this.book = new String[10];
    }
    void addbook(String book){
        this.book[noofbooks] = book;
        noofbooks++;
    }
    void showbooks(){
        System.out.println("available books are :- ");
        for (int j=0; j<noofbooks; j++) {
            System.out.println(book[j]);

        }
    }

    void issuebook(String enterbook){
        for (String wbook : book){
            if (enterbook == wbook){
                System.out.println("book issued");
                wbook = null;
            }
        }
    }
}
public class library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();



            Lib libo = new Lib();
            libo.addbook("hey");

        libo.addbook(book);

        libo.addbook("hey1");
        libo.addbook("hey2");
        libo.addbook("hey3");
        libo.addbook("hey4");
        libo.addbook("hey5");


            ;
            libo.showbooks();

            libo.issuebook("hey4");

            libo.showbooks();






    }
}
