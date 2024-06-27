
// Demo class is help to create an Objects of Multiple class and Execute it.

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setN1(25);
        calc.setN2(44);
        int result = calc.add();
        System.out.println(calc.getN1());
        System.out.println(calc.getN2());
        System.out.println("Addition of N1 +  N2 = "+ result);
        calc.num1 = 150;
        calc.num2 = 364;
        System.out.println("Addition of Num1 + Num2 = "+calc.addition(calc.num1,calc.num2));
        calc.display();
    }
}
