
//import java.lang.*;

public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "santhosh";
        sb = sb.append(str);
        System.out.println(sb);
        System.out.println(sb.capacity());
        StringBuilder stringBuilder = new StringBuilder("Hello this is StringBuilder");
        StringBuilder stringBuilder1 = new StringBuilder("This is StringBuilder");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder.equals(stringBuilder1));  // Compare Two String
        System.out.println(stringBuilder == stringBuilder1);
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder1.hashCode());
        System.out.println(sb.capacity()); // initially  capacity is 16 if any values added it will be increase
        sb = sb.append("newfollower");
        System.out.println(sb);
        System.out.println(sb.capacity());
        String name = stringBuilder.toString();
        System.out.println(name);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.subSequence(8,21));
        System.out.println(stringBuilder1.replace(2,8,"e"));
        stringBuilder1.ensureCapacity(100);
        CharSequence charSequence = stringBuilder1.subSequence(8,14); // unfortunately char sequence length is 16 so,
        // we can't use Interface if length is >16
        System.out.println(charSequence);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(5,","));
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.insert(3," "));

        //StringBuffer also same

        StringBuffer stringBuffer = new StringBuffer("samesamebutdifferent");
        System.out.println(stringBuffer);

        // String Buffer is Used for ThreadSafe once Thread topics start will deep into it.

    }
}
