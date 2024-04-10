
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name= "enter you name";
    }
    public MyMainEmployee(int myid){
        id = myid;
        name = "enter name";
    }
    public MyMainEmployee(int myid, String myname){
        id = myid;
        name = myname;
    }


    public int getId(){ return id; }
    public String getName(){ return name;}
    public void setId(int i){ id = i;}
    public void setName(String n){ name = n;}

}


public class constructor_overloading {
    public static void main(String[] args) {
        MyMainEmployee vraj = new MyMainEmployee(55 , "vraj" );

        System.out.println(vraj.getId());
        System.out.println(vraj.getName());


    }
}
