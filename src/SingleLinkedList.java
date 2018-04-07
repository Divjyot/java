public class SingleLinkedList {

    // Private: node is internal basic unit of LL so don't need to be exposed to public, the internal structure of LL
    // static: Node do has reference to outer LL class, Node class dont need to have its instances, Inhibits SLL to
    //          inherit any data member of Node class
    // inner:
    private static class Node{

    }

    public static void main(String[] args) {


        int[] arr = new int[5];
        arr[0]= 1;

        System.out.println(arr.length);



    }
}
