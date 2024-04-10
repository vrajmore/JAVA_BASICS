import java.util.Scanner;

class cyl {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}


public class cylinder {
    public static void main(String[] args) {

        Scanner mk = new Scanner(System.in);

        cyl mycyl = new cyl();


        System.out.println("enter radius");

        mycyl.setRadius(mk.nextInt());
        System.out.println("enter height");

        mycyl.setHeight(mk.nextInt());

        System.out.println(mycyl.getRadius());
        System.out.println(mycyl.getHeight());
    }
}
