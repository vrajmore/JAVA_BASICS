public class trycatch {
    public static void main(String[] args) {
        int a = 2000;
        int b = 0;


        try {
            int c = a/b;
            System.out.println("Result : "+c);
        }
        catch (Exception e){
            System.out.println("code not executed");
            System.out.println("as the error is :- " + e);
        }
    }
}
