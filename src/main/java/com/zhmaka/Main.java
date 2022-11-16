package com.zhmaka;

import com.zhmaka.arrayMethods.ArraysMethods;
import com.zhmaka.arrayMethods.Lock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraysMethods arraysMethods = new ArraysMethods();
        int[] array = arraysMethods.getArray();
        System.out.println();
        arraysMethods.sortBy(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Возведем каждое третье число массива в куб");
        arraysMethods.cubeTheThirdElement(array);
        System.out.println();
        Lock lock = new Lock(array);
        lock.printArray();
        lock.getArray()[0] = 10;
        lock.printArray();
    }
}