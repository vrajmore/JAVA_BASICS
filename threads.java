class wish extends Thread{
    public void run(){
        while(true){

            System.out.println("good morning");
        }
    }
}
class greet extends Thread{
    public void run() {
        while(true){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("welcome");
        }
    }
}

public class threads {
    public static void main(String[] args) {

        wish t1 = new wish();
        greet t2 = new greet();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());

        t1.start();
        t2.start();
    }
}
