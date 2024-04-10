public class stringtoint_using_ascii {
    public static void main(String[] args) {
        String s = "455";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            
            int num= (s.charAt(i) - '0');
            result = result * 10 + num;
        }
        System.out.println(result);
    }
}
