// You May Wonder How this Happening Let's Look Carefully and Run
// Concept Behind is Overriding

class A{
    A(){
        runmethod();
    }
    void runmethod(){
        System.out.println("Print A");
    }
}


class B extends  A{
    void runmethod() {
        System.out.println("Print B");
    }
}

class C extends  B{
    void runmethod(){
        System.out.println("Print C");
    }
}

public class MethodOverriding {

    public static void main(String[] args)
    {
       A a = new A();
       B b = new B();
       C c = new C();
    }
}
