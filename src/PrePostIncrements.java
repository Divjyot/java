public class PrePostIncrements {

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++); // 2: Here i value is returned and THEN is incremented.
        System.out.println(++i); // 3: i is incremented and then ite incremeneted value is returened.
        System.out.println(i--); // 3
        System.out.println(--i); // 1
        System.out.println(--i); // 0
    }

}
