
// java has lots of loops while , for ,do -while

public class Loop {
    public static void main(String[] args) {
        // Loop will repeat till the condition true when condition is false it will jump from execution

        // Using while loop
        int i = 1;
        int count=0;
        while (i <= 10){
            System.out.println("Hello");  // hello will be executed ten times;
            i++;
            count++;
        }
        System.out.println(count);
        System.out.println(i);  // After 10 time execution the count is now 11 cause the increment of i++

        // using for loop

        int j = 1;
        for(j = 1; j <= 10; j++){
            System.out.println("Hii"); // ten times Hii will be printed
        }
        System.out.println(j);  // the j is also now 11 becase the incrment of j++

        // do-while loop this loop execute at least once even the condition is false
        int k = 5;
        do{
            System.out.println("Welcome");
        }while(i < 0);  // the condition is fail but it executes once

        // Now modifying the Value of K to 1
        k = 1;
        do{
            System.out.println("Goodbye");
        }while (i <= 5);

        // what is Nested loop ?  -- loop inside a loop is called nested loop


        for(int a = 1; a <= 5; a++)
        {
            for(int b = 1; b <= 5; b++){

                System.out.print(a * b+" ");   // a = 1 <=5  & b = 1,2 ,3,4 ,5 then loop jump
                // check condition a = 2 <= 5 & b = 1,2,3,4,5 likewise   a is 5  5<=5 till execute
            }
            System.out.println(" ");
        }

        // print Even numbers from 1 to 20
        System.out.println("Even numbers from 1 to 20 ");
        for(int x = 1; x <= 20; x++) {
            if (x % 2 == 0) {                     // check the condition  x % 2 == 0  then it's even number;
                System.out.print(x+",");
            }
        }
        System.out.println();


    }
}
