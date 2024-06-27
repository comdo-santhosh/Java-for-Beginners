
class Calculator {
    Calculator(){
        System.out.println("Object is Created");
    }

    // n1 & n2 are Instance variable, but it can be accessed with in the class if, need access using getter & setter
    private int n1;
    private  int n2;

    // num1 & num2 as well Instance variable, but it can be accessed anywhere and any class by using objects
    int num1;
    int num2;

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int add(){
        return  n1 + n2;
    }

    public int addition(int n1 , int n2){    // here the n1 and n2 these are local variables
        return  num1 + num2;
    }

    public void display(){
        System.out.println("Values Adddes");
    }
}

