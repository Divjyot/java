public class classOne {


    public static void main(String[] args) {

        String string = new String();
        string = "D D";
        System.out.println(reverseWords(string));

        System.out.println(reverseNew(string));

    }

    /**
     * Swaps 'words' in v (text separated by spaces) unless
     * the swapped version is identical - in which case it returns null
     */
    public static String reverseWords(String v) {


        String[] strings = v.split("\\s+");

        String result = new String();

        for (String string : strings) {
            result = string + " " + result;
        }

        System.out.println(v == (result) ? "TRUE":"FALSE");
        if (result.equals(v)) {
            System.out.println("Nl");
            return null;
        }

        return result;
    }



    public static String reverseNew (String v){

        String[] strings = v.split("\\s+");
        String result = strings[0];
        for (int i  = 1; i < strings.length ; i++) {
            result = strings[i] + " " + result;
        }
        return result.equals(v) ? null : result;
    }

}