public class UniqueChar {

    private static boolean asciiArr [] = new boolean[256];

    public static boolean isUnique(String str){

        for (char c:
             str.toCharArray()) {
            int asciiVal = (int)c;
            if (asciiArr[asciiVal]) return false;
            asciiArr[asciiVal] =true;
        }
            return true;
    }

    public static void main(String[] args) {

        System.out.println(isUnique("abcadef"));

    }
}
