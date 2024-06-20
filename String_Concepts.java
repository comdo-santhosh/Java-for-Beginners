import java.util.Arrays;

public class String_Concepts {
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str);
        String str1 = new String("helloworld");
        System.out.println(str1 == str); // compare the objects
        System.out.println(str.equals(str1)); // compare the content
        String name = " ";
        boolean isblank = name.isBlank(); // if whitespace or null
        System.out.println(isblank);
        System.out.println(name.isEmpty()); // if null only

        String s1 = "santhosh";
        String s2 = "kumar";
        String s4 = s1 + s2;
        System.out.println(s4);  // concatenating
        System.out.println(s1+" "+ s2);

        String s3 = s1 + "kumar";
        System.out.println(s3);
        System.out.println(s3.equals(s4));

        String string = "abcdefg";
        String string1 = "   abcdefghg    ";
        System.out.println(string.length());

        for(int i = 0;  i < string.length(); i++){
            System.out.print(string.charAt(i)+" ");
        }
        System.out.println();
        System.out.println(string.toString());
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(0,2));
        System.out.println(string.substring(string.length()-2));
        System.out.println(string.substring(string.length()/2));
        System.out.println(string.contains("ef"));
        System.out.println(string.endsWith("fg"));
        System.out.println(string.startsWith("ab"));
        System.out.println(string.repeat(2));
        char charstr[] = string.toCharArray();
        System.out.println(Arrays.toString(charstr));
        System.out.println(string.equalsIgnoreCase("abcdefgh"));  // "abcdefg"   , "abcdefgh" so it is false
        System.out.println("before trim the length of the string1 is  = " +string1.length());
        // before trim the length of the string1 is
        string1 =  string1.trim();  // 7 white spaces removed
        System.out.println(string1);
        //after trim the length of the string is
        System.out.println("after trim the length of the string is = "+ string1.length());
    }
}
