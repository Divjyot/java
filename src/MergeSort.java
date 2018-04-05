/**
 * Merge Sort
 *
 * Worst Case Complexity O(n log n)
 * Assumption: the elements are to be sorted in non decreasing order.
 *
  */


/** DIVIDE and CONQUER
 * Approach:
 * 1. a sequence of numbers ~ array of numbers
 * 2. split into halves ~ [first] --- [middle-1], [middle]----[last]
 * 3. sort individual sequences.
 * 4. 'Merge' the sequences resulting in a sorted one sequence.
 */

public class MergeSort {
    static int a[] = {15,13,16,17,18,11};


    public static void mergeSort(int[] array, int first, int last) {

        if(first<last){ // there are still element to sort
            //Divide the array
            int mid  = (last - first ) / 2;

            //Solve the sub problem
            mergeSort(array, first, mid);
            mergeSort(array, mid+1, last);
            merge(first,mid,last);

        }
    }

    public static void merge(int first, int mid, int last){
//        System.out.println("Merge: "+"First : "+first +" Mid: "+ mid +"Last: "+ last);

/**
 * [ X, X, X,   X,    X, X, X, X, X]
 * |---------...|     |-----------|
 * Ls           Le    Rs          Re
 */
        int left = first;
        int right = mid + 1;
        int b[] = new int[a.length];
        int i = first;

        while(left <= mid && right <= last){

            if(a[left] <= a[right]){
                b[i] = a[left];
                System.out.println(a[left] +" Left < Right "+ + a[right] );
                left ++;

            }else{
                b[i] = a[right];
                System.out.println(a[left] + " Left > Right "+ a[right] );
                right++;

            }
            i++;

        }

        /**
         * When one of the array goes out of bounds, just start copying remaining elements
         * in smallest-first order.
          */

        if(left > mid){
            // Left array is completely traversed, right still remaining
            for (int j = right; j <= last; j++) {
                b[i] = a[j]; i++;
            }
        }else{
            for (int k = left; k <= mid; k++) {
                b[i] = a[k]; i++;
            }
        }

        for (int j = 0; j < b.length; j++) {
            a[j]=b[j];
        }

    }


    public static void main(String[] args) {
        System.out.println("\nBefore:");
        printArray(a);
        mergeSort(a,0,a.length-1);
        System.out.println("After:");
        printArray(a);
    }

    public static void printArray(int array[]){
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
