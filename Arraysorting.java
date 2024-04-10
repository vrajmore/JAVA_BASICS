public class Arraysorting {
    public static void main(String[] args) {

        int[] num = {1,2,3,7,8,9,4,5,6};
        int temp = 0;

        System.out.print("unsorted array ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("");

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] <= num[j]){
                    System.out.println("sorted");
                }else {
                    System.out.println("not");
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("sorted array ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("");

    }
}
