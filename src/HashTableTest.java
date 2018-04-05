import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class HashTableTest {

    private  Object keyObj1;
    private  Object keyObj2;
    private  Object keyObj3;

    private Object valueObj1;


    HashTable sampleHT;

    @Before
    public void addItems(){
        sampleHT = new HashTable();
        keyObj1  = 5;       //randomNumber(1,10);
        valueObj1  = 55;    //randomNumber(1,10);
        sampleHT.add(keyObj1,valueObj1);

    }
    private static  int randomNumber(int min, int max){
        Random rand = new Random();
        int randomNum = min + rand.nextInt((max - min) + 1);
        return randomNum;
    }

    @Test
    public void containsItemsAdded(){
        assertEquals("Value 1 not found",sampleHT.getValue(keyObj1),valueObj1);

    }

}