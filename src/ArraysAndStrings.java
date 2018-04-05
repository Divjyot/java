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
     * @param inputString
     */
    public static String[] removeDuplicate(String [] inputString){

        if (inputString.equals("") || inputString == null || inputString.length <2){
            return inputString;
        }

        int tail = 1;

        // Comparing with every element f
        for (int i = 1; i < inputString.length; i++) {

            int j;
            for (j = 0; j < tail; j++) {
                if (inputString[i].equals(inputString[j])) break;
            }
            if(j == tail){
                inputString[tail] = inputString[i];
                tail++;
            }
        }
        inputString[tail] = "-";
        return inputString;
    }

    public static void main(String[] args) {
       // System.out.println(uniqueChar("abcda"));
       // System.out.println(reverseString("abxcbd\0"));
        String [] inputString = {"a","b","c","d","a","d"};
        String [] re = removeDuplicate(inputString);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }
    }
}
