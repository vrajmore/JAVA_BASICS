import java.util.Arrays;
import java.util.Scanner;

class InvalidInput extends Exception{
    @Override
    public String getMessage() {
        return "invalid input please enter correct input";
    }
    @Override
    public String toString() {
        return "invalid input";
    }
}
class MaxInput extends Exception{
    @Override
    public String getMessage() {
        return "please enter value less then 1000";
    }

    @Override
    public String toString() {
        return "you excedeed maximum input limit";
    }
}




class calculator{
    public int a;
    public int b;
    String oper;
    int c;


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void calc(){
        if(oper.equals("+")){
            c = a+b;
        }
        else if (oper.equals ("-")) {
            c = a-b;
        }
        else if (oper.equals ("/")) {
            c = a/b;
        }
        else if (oper.equals ("*")) {
            c = a*b;
        }
    }

    public int getC() {
        return c;
    }

}


public class customexceptionwithcalculator {
    public static void main(String[] args) {

        int fdig=0;
        String op="";
        int sdig=0;
        Scanner sc =  new Scanner(System.in);
        do {

            System.out.println("enter first digit to calculate");
            try {
                fdig= sc.nextInt();
                if (fdig>1000){
                    throw new MaxInput();
                    }
            }
            catch(MaxInput e){
                System.out.println(e);
            }
        }while (fdig>1000);

        String[] operators = new String[]{"+", "-", "*", "/"};

        do {
            System.out.println("enter operation to calculate such as:- + , - , * , / ");
            op = sc.next();
        }while (!Arrays.stream(operators).toList().contains(op));
//              != ("+") || op !=("-") || op !=("/") || op !=("*")
        do{

            System.out.println("enter second digit to calculate");
            try {
                sdig= sc.nextInt();
                if (sdig>1000){
                    throw new MaxInput();
                }
            }
            catch(MaxInput e){
                System.out.println(e);

            }

        }while(sdig>1000);
        calculator newc = new calculator();
        newc.setA(fdig);
        newc.setB(sdig);
        newc.setOper(op);

        newc.calc();
        System.out.println(newc.getC());
    }
}
