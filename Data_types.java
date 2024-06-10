
// Data Types is A unique Keywords
/*
    Data types can't be considered as Variables
    in java Two different Data Types Primitive and Non-primitive

    1) Primitive DT  -- Integer ,Float ,  Character , Boolean ,
      Integer - byte , short , int , long
      Float  - float , double
      Character - char
      Boolean  - boolean

     2) Non-primitive data types are known as Objects
       String
       Arrays
       Object

 */


public class Data_types {
    public static void main(String[] args)
    {
         byte b = 127 ; // limit is -128 to +127   2^8
         short s = 32767;  // limit is -2^15 to +2^15 - 1
         int i = 7898374; // limit is -2^31 to +2^31-1
         long l = 9087093403l;  // limit is -2^63 to +2^63-1
         float f = 8654.345f; // limit is -2^31 to +2^31-1  IEEE754 Format single Precision
         double d = 94854786.86754d;  // limit is -2^63 to +2^63-1  IEEE754 Format Double Precision
         char c  = 's';  // default is '\u0000'  it's 2bytes = 16bit   0 to 255 unique ASCII
         boolean bool = false; // it's 1 Bit default is False and it has either true or false

        System.out.println("Byte = "+b+" and Range is = "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Short = "+" and Range is = "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("int = "+i+" and Range is = "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("long = "+l+" and Range is = "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("float = "+f+" and Range is = "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("double = "+d+" and Range is = "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        System.out.println("char = "+c+" and Range is = "+Character.MIN_VALUE+"to "+Character.MAX_VALUE); // it's unique Code ASCII 0 - 256 Codes
        System.out.println("boolean = "+bool+" and range is "+true+" and "+false);

    }
}
