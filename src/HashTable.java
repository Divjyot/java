import java.util.*;

/**
 *
 * @param <K> Key
 * @param <V> Value
 *
 * HashTable with Separate chaining.
 *
 */
public class HashTable<K,V> extends AbstractMap{

    private static int N = 1000;
    private LinkedList<V> [] hashTable = new LinkedList[N];


    public void add( K key, V value){
        int hash = hashFunction(key);
        LinkedList<V> aBucket = new LinkedList<>();
        aBucket.add(value);

        hashTable[hash]= aBucket;

    }


    public V getValue(K key){

        int hashCode = hashFunction(key);
        LinkedList<V> bucket = hashTable[hashCode];

        if (bucket != null){
            Iterator<V> bucketIterator = bucket.iterator();

            while (bucketIterator.hasNext()){
                System.out.println("Element: "+ bucket.element());
                if (bucketIterator.next().equals(bucket.element())){
//                    System.out.println("Found Element: "+ bucket.element());
                    return bucket.element();
                }
            }
        }

        /**
         *Serves two purposes when control reaches this point,
         * 1. if bucket is null, it returns null
         * 2. if control dont go in inner most if condition meaning the bucket dont have the value then return null
         *
         * a poor coding  can be :
         if (bucket != null){
             while (bucketIterator.hasNext()){
                if (bucketIterator.next().equals(bucket)){
                    return bucket.element();
                } else{
                    return null;
             }
         }else{
         return null;
         }
         */
        return null;

    }


    public boolean containsValueForKey(K key){
        // same as getValue
        int hashCode = hashFunction(key);
        LinkedList<V> bucket = hashTable[hashCode];

        if (bucket != null){
            Iterator<V> bucketIterator = bucket.iterator();

            while (bucketIterator.hasNext()){
                if (bucketIterator.next().equals(bucket)){
                    return true;
                }
            }
        }
        return false;
    }




    private int hashFunction(K key){
        // HasCode, using java's hashCode()
        int hashCode = key.hashCode();

        // Compression Function

        //1. i mod N
        int bucketIndex1 = hashCode % N;
        return bucketIndex1;

        /*
        //2. ((a*(hashCode)+b)mod p) mod N), a and b are random number in range [0... p-1], where p is prime number larger than 'n'
        int p = 1001;
        int a = randomNumber(0, 1001);
        int b = randomNumber(0, 1001);
        int bucketIndex2 = ((a*(hashCode)+b)% p) % N;   (given: a mod N != 0 otherwise every integer will map to b)
        return bucketIndex2;
        */
    }

    private static  int randomNumber(int min, int max){
        Random rand = new Random();
        int randomNum = min + rand.nextInt((max - min) + 1);
        return randomNum;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    public static void main(String[] args) {
        HashTable sampleHT = new HashTable();
        Integer k = 5;
        Integer v = 55;
        sampleHT.add(k,v);
        System.out.println(sampleHT.getValue(k).toString());
    }

}
