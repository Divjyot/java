import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {

    public static boolean anagram(String str1, String str2){

        char [] strArr1 = str1.toCharArray();
        Arrays.sort(strArr1);
        System.out.println(Arrays.toString(strArr1));

        char [] strArr2 = str2.toCharArray();
        Arrays.sort(strArr2);
        System.out.println(Arrays.toString(strArr2));

        return   Arrays.equals(strArr1,strArr2);
    }
    public static void main(String[] args) {
        String one = "cab";
        String two = "acb";
        System.out.println(anagram(one,two));

    }
}
