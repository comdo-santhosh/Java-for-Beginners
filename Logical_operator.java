
// Logical operators -- AND , OR , NOT
public class Logical_operator {
    public static void main(String[] args) {
        int x = 5 , y = 7;
        int a = 10 , b =19;
        boolean res = ( x > y ) || (a < b);
        boolean check = (a > x) && (b > x+y);
        System.out.println(res);  // true
        System.out.println(check);
        System.out.println((a + b) > (x+y) && (x+a) > (y+b));
        System.out.println(!(a>b));  //  ! false - > true
    }
}
