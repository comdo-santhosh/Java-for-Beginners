
// conditional statement check condition and print

public class Conditional_statement {
    public static void main(String[] args) {

        int age = 19;

        if(age >= 18){
            System.out.println("Eligible for vote");
        }

        if(age < 18){
            System.out.println("Wait till");
        }
        int i = 10;

        if(i < 10){
            System.out.println("The number is less than 10");
        }
        if(i == 10){
            System.out.println("the i is equal to 10");
        }

        i = 15;
        if(i > 10){
            System.out.println("Hellowold");
        }else{
            System.out.println("Bye");
        }

        i = 25;
        if(i > 10 && i < 20){
            System.out.println("Hello");
        }else {
            System.out.println("Goodbye");
        }

        int x = 8;
        int y = 19;
        int z = 11;

        if(x > y && x > z){
            System.out.println(x+" is biggest");
        }else if(y > z){
            System.out.println(y+" is biggest");
        }else{
            System.out.println(z+" is biggest");
        }

        // Now Introducing Ternary  operator

        // checking with two variable x and y
        String res = (x > y)   ? ( x +" is biggest") : (y+" is biggest");  // if else in single line
        System.out.println(res);
    }
}
