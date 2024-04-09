public class stringbuilder {
    public static void main(String[] args) {
        int t = 8;
        StringBuilder sb = new StringBuilder();
        String s= "";
        for (int i = 1 ; i<=10; i++){
            int ans = i * t;
            s =+ t+"X"+i+"="+ans;

            sb.append(t).append("X").append(i).append("=").append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
