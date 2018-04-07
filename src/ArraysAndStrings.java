public class ArraysAndStrings {

    /**
     * Unique Char in String with no secondary data structure
     * 1.1 1st Approach
     * @param sample
     * @return
     *
     * O(NxN)
     */
    public static boolean uniqueChar (String sample){

        char [] stringArr = new char[sample.length()];
        for (int i = 0; i < sample.length(); i++) {
            for (int j = i+1; j < sample.length()  ; j++) {
                System.out.println("Printing j: "+ sample.charAt(j));
                if (sample.charAt(i) == sample.charAt(j)) {
                    System.out.println("True: " + i + " & " +  j);
                    return true;
                }

            }
            System.out.println("\n");
        }
        return false;
    }

    /**
     * 1.1 2nd Approach
     * @param sample
     * @return
     *
     * O(N)
     */
    public static boolean uniqueChar2(String sample) {

        boolean [] char_set = new boolean[256];
        for (int i = 0; i < sample.length(); i++) {
            int value = sample.charAt(i);
            if (char_set[value]) return false;
            char_set[value] = true;
        }
        return true;
    }

    /**
     * C-Style String Reversal
     *  abcd is five characters including null character at end
     * 1.2
     * @param cString
     */
    public static String reverseString (String cString){

        char charArr[]  = new char[cString.length()];

            for (int i = 0; i <= cString.length()/2; i++) {
                char first = cString.charAt(i);
                char last =  cString.charAt(cString.length() - 1 - i );
                charArr[i] = last;
                charArr[cString.length() - 1 - i ] = first;
            }

          String result = new String(charArr);
        return result;
    }

    /**
     *
     * @param str
     */
    public static String[] removeDuplicate(String [] str){

        if (str.equals("") || str == null || str.length <2){
            return str;
        }

        int tail = 0;

        for (int i = 0; i < str.length; i++) {
            boolean found = false;

            // check if character is already present in
            // the part of the array before the current char
            for (int j = 0; j < i; j++) {
                if (str[j] == str[i]) {
                    found = true;
                    break;
                }
            }

            // if char is already present
            // skip this one and do not copy it
            if (found) {
                continue;
            }

            // copy the current char to the index
            // after the last known unique char in the array
            str[tail] = str[i];
            tail++;
        }

        str[tail] = "0";
        return str;
    }

    public static void main(String[] args) {
       // System.out.println(uniqueChar("abcda"));
       // System.out.println(reverseString("abxcbd\0"));
        String [] inputString = {"a","b","c","a","d"};
        String [] re = removeDuplicate(inputString);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }

        char i = 'a';
        int x = i;
        System.out.println(x);


    }
}
