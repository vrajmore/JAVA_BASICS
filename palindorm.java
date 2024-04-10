public class palindorm {
    static int reverse(int num){
        int revnum = 0;
        while (num > 0) {
            revnum = revnum*10 + num%10;
            num = num/10;
        }
        return revnum;
    }
    public static void main(String[] args) {

        int enter = 12325;

        System.out.println("int enter -- "+ enter);

        String a = String.valueOf(enter);
        System.out.println("string a -- "+a);
        String b ="";

        for (int i = a.length()-1; i >= 0 ; i--) {
            b += a.charAt(i);
        }
        System.out.println("string b -- "+b);

        int reversenum = reverse(enter);
        System.out.println("int reverse -- "+reversenum);


        if (a.equals(b)){
            System.out.println("palindrom");
        }else {
            System.out.println("not palindrom");
        }


    }
}
