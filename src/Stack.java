public class Stack<T> {

    /**
     * Array based Stack
     * Operations: Push, Pop
     *
     */

    private int CAPACITY  = 100;
    private T[] stackArray ;

    public Stack(){
        stackArray = (T[]) new Object[CAPACITY];
    }


    public void push(T item){

    }

    public T  pop(){

        return stackArray[0];
    }


    public static void main(String[] args) {


    }


}

