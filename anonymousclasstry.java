
interface anon1{
    void meth1();
//    void meth2();
}

public class anonymousclasstry {
    public static void main(String[] args) {

//        anon1 an = new anon1() {
//            @Override
//            public void meth1() {
//                System.out.println("meth1 printed");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("meth 2 printed");
//            }
//
//        };
//        an.meth1();

        anon1 an =()->{
            System.out.println("hello this is method 1 by lambda ");
        };
        an.meth1();


    }
}
