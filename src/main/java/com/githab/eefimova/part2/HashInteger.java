package com.githab.eefimova.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashInteger {
    public List<Integer>[] array;

    public HashInteger() {
        array = new ArrayList[13];
        for (int i = 0; i < 13; i++) {
            array[i] = new ArrayList<>();
        }
    }


    public void add(int number) {
        array[getHash(number)].add(number);
    }

    public boolean delete(int number) {
        int hash = getHash(number);
        boolean isExist = false;
        Iterator<Integer> i = array[hash].iterator();
        while (i.hasNext()) {
            int n = i.next();
            if (n == number) {
                isExist = true;
                i.remove();
                break;
            }
        }
        return isExist;
    }

    public boolean contains(int number) {
        int hash = getHash(number);
        boolean isExist = false;
        for (int i : array[hash]) {
            if (i == number) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    private int getHash(int number) {
        return number % 13;
    }
}
