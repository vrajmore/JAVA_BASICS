public class Factorial {
    static int Rfacto(int x){
        // fatorial using recursive method
        // optimised way of doing
        if (x == 1){
            return 1;
        }
        return (x*Rfacto(x-1));
    }

    static int Ifacto(int x){
        //factorial using for loop
        for (int i = (x-1); i > 1; i--) {
            x = x * i;
        }
        return x;
    }
    public static void main(String[] args) {

        System.out.println("factorial using recursion "+Rfacto(5));

        System.out.println("factorial using forloop "+Ifacto(5));

    }
}
