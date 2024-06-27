
// Constructor is Special type of Function
// Constructor name is same as Class name   constructor is default , parameter % non-parameter

class Templerun{

    int point  = 0;

    Templerun(){
        Templerun.run();
        System.out.println("Object is Created");
    }
    static void run(){
        System.out.println("Moving");
    }
    Templerun(String left){
        System.out.println("Move left Side");
    }
    Templerun(String down,String jump ){
        System.out.println("Move down & jump side");
    }

    Templerun(String Stop,int exit){
        System.exit(exit);
    }
}

public class Constructors {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Templerun();
            System.out.println(new Templerun()); // Every Time New Object is Created The Constructor will be called
        }
        Templerun t = new Templerun(); // When object created the constructor will be called
        Templerun t11= new Templerun("Stop",0);
        Templerun t1 = new Templerun("Down","Jump ");
    }
}
