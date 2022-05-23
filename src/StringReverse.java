import java.util.Collections;

public class StringReverse {
    public static void main(String[] args) {
        String str = "I am Divyam";

        // Using String Builder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        // Manually
        String revString = "";
        char [] chars = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--){
            revString +=chars[i]+"";
        }
        System.out.println(revString);

        // Otherwise
        StringBuilder strBuilder = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            strBuilder.append(str.charAt(i));
        }
        String str1 = new String(strBuilder);
        System.out.println(str1);

    }
}
