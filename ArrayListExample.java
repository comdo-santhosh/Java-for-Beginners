import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car{
    public static  List<Integer> values;
}

class Abs extends  Car{

    public List<Integer> result(){
        values = new ArrayList<>();
        values = Arrays.asList(1,2,3,4,5);
        return values;
    }

}


public class ArrayListExample {
    public static void main(String[] args)
    {
        Abs abs = new Abs();
        System.out.println(abs.result());
        System.out.println(abs.values);
        System.out.println(Abs.values);
        ArrayList<Integer> list = new ArrayList(abs.result());
        System.out.println(list);
    }
}
