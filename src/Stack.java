public class Stack<T> {

    /**
     * Array based Stack
     * Operations: Push, Pop
     *
     */

    private int CAPACITY  = 100;
    private T[] stackArray ;
    private int top = -1;

    public Stack(){
        stackArray = (T[]) new Object[CAPACITY];
    }


    public void push(T item){

        if (top==CAPACITY) return;
        top = top+1;
        stackArray[top] = item;
    }

    public T  pop(){
        if (top == -1) return null;
        T item = stackArray[top];
        stackArray[top] = null;
        top = top - 1;
        return item;
    }


    public static void main(String[] args) {

    }


}

