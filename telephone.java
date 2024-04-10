abstract class Tele{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTele extends Tele {
    @Override
    void ring(){
        System.out.println("ringing");
    }
    @Override
    void lift(){
        System.out.println("picking up the phone");
    }

    @Override
    void disconnect() {
        System.out.println("disconnected");
    }
    void display(){
        System.out.println("displaying number");
    }
}

public class telephone {
    public static void main(String[] args) {

        Tele p1 = new SmartTele();
        p1.ring();
        p1.lift();
        p1.disconnect();

        SmartTele p2 = new SmartTele();
        p2.display();
    }
}
