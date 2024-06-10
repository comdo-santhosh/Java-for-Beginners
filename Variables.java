
// Variable is container to Store Data or Values
// Java is Strictly typed Language
/*
      Structure
      ---------
      DataType Variable_name = value;

 */

public class Variables {
    public static void main(String[] args) {
        byte b = 34;
        short s = 256;
        int num = 123;
        int num1 = 123;
        System.out.println(num +" "+ num1);
        float f = 7.45f;   // f is floating format  , IEEE754 32Bit representation
        System.out.println(f);
        System.out.println(num+num1);
        char ch = 'a';   // character a
        ch++;  // incrment or ch = ch + 1;
        System.out.println(ch);
        // variable can't be duplicate which means if a is already defined we can't create again
        double d = 63820;    // double is 8byte size 64 bits representation - IEE754
        System.out.println(d);
        long l = 9087093403l;
        System.out.println(l);
        boolean bool  = true;   // boolean is either true or false  // by default boolean is false ;
        System.out.println(bool);
        boolean istrue;
        istrue = false;
        System.out.println(istrue);
    }
}
