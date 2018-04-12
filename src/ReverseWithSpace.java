import java.util.LinkedList;

public class ReverseWithSpace {

    private static Stack<Character> givenStack = new Stack();

    private static int l ;
    private static int k ;
    public static void reverse(char [] arr, int index){

        if (index > arr.length-1){return;}

        for (int i = index ; i < arr.length ; i++){

            if(arr[i] != ' '){
                givenStack.push(arr[i]);
                l = i;
            }else {
                break;
            }
        }

        // Note: number from index to l should match the stack pushed
        for (int i = index ; i <= l; i++){
            arr[i] = givenStack.pop();
            System.out.println("POP");
        }
        // Why
        reverse( arr,l+2);
    }

    public static void main(String[] args) {
        String str = "ABC DEFX";
        char [] charArry  = str.toCharArray();
        reverse(charArry,0);

        for (char c:
             charArry) {
            System.out.println(c);
        }
    }
}
