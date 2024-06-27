package MethodOverloading;

// the Methodoverloading is using same method to use and run multiple time with different no of parameters and datatype
class Addition{

    Addition(){
        System.out.println("Object is Created");
    }

    public int add(int a,int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b + c;
    }

    public double add(double a,double b,double c){
        return a + b + c;
    }
}

public class Demo {
    static Addition obj = new Addition();
    public static void main(String[] args) {
        int res = obj.add(14,18);
        double d = obj.add(19,25);   // double add will be called
        int result = obj.add(18,32,65);
        double dob = obj.add(19,27,38);
        System.out.println(res+ " "+ d+" "+ result+" "+dob);
    }
}
