import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {

    public static boolean anagram2(String str1, String str2) {
        int letters[] = new int[256]; // 256 ASCII values corresponding to each char
        int unique = 0;
        int totalIn1 = 0;
        int completed1 = 0;

        if (str1.length()!=str2.length()) return  false;
        for (char c :str1.toCharArray()
             ) {
            if(letters[c] == 0){unique++;} // count of unique char
            letters[c]++; // count of each char
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (letters[c] == 0) return false ; //t has different element

            letters[c]--;

            if (letters[c] == 0){
                completed1 ++;
                if(completed1 == unique){
                    return i == str2.length()-1; // you satsfied the s as well as run out of t elements..
                }
            }
        }

        return false;

    }


    public static boolean anagram1(String str1, String str2){

        char [] strArr1 = str1.toCharArray();
        Arrays.sort(strArr1);
        System.out.println(Arrays.toString(strArr1));

        char [] strArr2 = str2.toCharArray();
        Arrays.sort(strArr2);
        System.out.println(Arrays.toString(strArr2));

        return   Arrays.equals(strArr1,strArr2);
    }

    public static char[] addSymbol(){
        String  string  = "I am a string";
        int spaces = 0;
        char [] original = string.toCharArray();

        for (char c:string.toCharArray()
                ) {
            if(c == ' '){
                spaces ++;  // altervnatively you can get this from array created usign split
            }
        }
        int oriLength =string.toCharArray().length;
        int newLength = oriLength + spaces*2;
        char [] result = new char[newLength];

        for (int i = oriLength - 1; i >= 0; i--) {
            if (original[i] == ' '){
                result[newLength-1] = '0';
                result[newLength-2] = '2';
                result[newLength-3] = '%';
                newLength = newLength -3;
            }else {
                result[newLength-1] = original[i];
                newLength = newLength -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String one = "cab";
        String two = "acbx";
        System.out.println(anagram1(one,two));
        System.out.println(anagram2(one,two));
        char [] string  = addSymbol();
        for (char c:string
             ) {
            System.out.println(c);
        }

    }
}
