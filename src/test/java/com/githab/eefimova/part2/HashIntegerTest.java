package com.githab.eefimova.part2;

import com.githab.eefimova.part2.HashInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashIntegerTest {

    @Test
    public void add() {
        HashInteger hashInteger = new HashInteger();
        hashInteger.add(7);
        hashInteger.add(5);
        int number = 5;
        hashInteger.add(5);
        int result = 14;
        for (int j = 0; j < 13; j++) {
            for (int i : hashInteger.array[j]) {
                if (i == number % 13) {
                    result = j;
                    break;
                }
            }
        }
        Assertions.assertEquals(5, result);
    }

    @Test
    public void delete() {
        HashInteger hashInteger = new HashInteger();
        hashInteger.add(7);
        hashInteger.add(5);
        boolean result = hashInteger.delete(5);
        Assertions.assertTrue(result);
    }

    @Test
    public void contains() {
        HashInteger hashInteger = new HashInteger();
        hashInteger.add(7);
        hashInteger.add(5);
        boolean result = hashInteger.contains(7);
        Assertions.assertTrue(result);
    }

    @Test
    public void bigNumberCorrect() {
        HashInteger hashInteger = new HashInteger();
        hashInteger.add(7);
        hashInteger.add(5);
        int number = 21;
        hashInteger.add(21);
        int result = 14;
        for (int j = 0; j < 13; j++) {
            for (int i : hashInteger.array[j]) {
                if (i == number) {
                    result = j;
                    break;
                }
            }
        }
        Assertions.assertEquals(8, result);
    }

}
