
// static variable can't be declared inside a method or main() methods it will be declared as class Members

class StaticMethods{
    String result = "called";   // Instance Variable
    static String name = "Java Program";
    static {
        System.out.println("Static block Called , "+name);
    }

    public static void display(){
        String result = "hello";    // local variable       // Inside a static method can create and call static & non-static
        System.out.println("Static Method "+result);   // Outside non-static varible can't be calles
    }
}



public class staticVariableandblock {

    static{
        System.out.println("Static block Will Execute First");
    }

    static int size = 50;

    public static void main(){
        System.out.println("Hellworld");
    }

    public static String message(String name){
        return "Greetings , welcome "+ name;
    }

    public static void main(String[] args) throws ClassNotFoundException{
//        staticVariableandblock.main();
//        String name = "Sekarnathan";
//        System.out.println(message("santhosh"));
//        System.out.println(message(name));
//        System.out.println(staticVariableandblock.size);
//
//        StaticMethods staticMethods = new StaticMethods();
//        System.out.println(staticMethods.result);
//        System.out.println(StaticMethods.name);
//        StaticMethods.display();
          Class.forName("StaticMethods");
          StaticMethods.display();
    }
}
