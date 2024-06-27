

class Aa{
    Aa(){
        System.out.println("Aa Constructor");
    }
    Aa(int a){
        System.out.println("Aa Parameter Constructor");
    }
}

class Bb extends  Aa{
    Bb(){
        super();
        System.out.println("Bb Constructor");
    }
    Bb(int b){
        super(5);   // Going to Above Constructor Which has Parameter
        System.out.println("Bb Parameter Constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Bb  b1 = new Bb(); // IF parameter Not passed it will be Aa constr.. & Bb constr..
        Bb b2 = new Bb(12); // reverse of above

    }
}
