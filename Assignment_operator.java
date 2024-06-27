

// assignment operators assign values to left side and taken from right side;

// = , += , -= , /= . %= , != these are some assignment operators

public class Assignment_operator {
    public static void main(String[] args) {

        int value = 100;  // 100 is right side and variable value is left side now the equal operator is assigned it.

        value = value + 200;
        System.out.println("After adding value ="+value);

        value = value - 50;
        System.out.println("After subtracting value ="+value);

        value = value * 5;
        System.out.println("After multiplying value ="+value);

        value = value / 11;
        System.out.println("After dividing value ="+value);

        value = value % 3;
        System.out.println("After modulo value ="+value);

    }
}
