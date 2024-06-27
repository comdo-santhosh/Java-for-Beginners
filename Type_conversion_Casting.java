

// Type_conversion has 2 types implicit and explicit
// implicit conversion will automatically done by compiler and explicit conversion is done by user's

public class Type_conversion_Casting {
    public static void main(String[] args) {
        float f = 7.45f;
        int num = (int )f;    //  conversion from float to int
        System.out.println(f);  // float
        System.out.println(num); // int
        int n = 548;
        double d = n;  // automatically conversion because double is higher order
        System.out.println(n);
        System.out.println(d);

        int n1 = 10;
        int n2 = 15;
        float res  = n1 + n2;
        System.out.println(res);

        byte b = 12;
        short s = b;
        System.out.println(s);

        int val = 1976;
        short sh = (short)val; // it has capacity to store it.

     }
}
