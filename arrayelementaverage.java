public class arrayelementaverage {
    public static void main(String[] args) {
        float[]num = new float[5];
        num[0]=10;
        num[1]=20;  
        num[2]=30;
        num[3]=40;
        num[4]=50;

        System.out.println("printing sum of arrays");
        float average = 0;
        float sum = 0;

        for(int i=0; i<num.length; i++){

            sum = sum + num[i];
            average = sum/num.length;
        }
        System.out.println("average of all numbers in array is "+average);

    }
}

