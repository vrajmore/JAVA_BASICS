import java.util.Scanner;

public class arrayelementfinder {
    public static void main(String[] args) {

        float[]num = new float[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number you wana match");
        float in = sc.nextFloat();



            for(int i=0; i<num.length; i++){
                if (num[i]==in){
                    System.out.println("match");
                    break;
                }
                else {
                    System.out.println("not found");
                }


            }





    }
}
