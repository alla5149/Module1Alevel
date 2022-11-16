package com.zhmaka.arrayMethods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysMethods {

    final Scanner input = new Scanner(System.in);
    final Random random = new Random();

    public int[] getArray() {
        System.out.println("Введите длинну масива, который будет больше или равен 10");
        int sizeArray = input.nextInt();
        if(sizeArray >= 10) {
            int[] array = new int[sizeArray];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 200 - 100);
            }
            String intAString = Arrays.toString(array);
            System.out.println(intAString);
            return array;
        }else {
            System.out.println("Длинна массива меньше 10");
        }
        return getArray();
    }


    public int sortBy(int[] array) {
        int answer = 0;
        System.out.println("Как вы хотыте отсортировать массив?\n 1 - сортировка по росту; \n 2 - сортировка по убыванию");
        answer = input.nextInt();
        if (answer == 1) {
            sortByGrowth(array);
        } else if (answer == 2) {
            sortDescending(array);
        } else {
            System.out.println("Такого варианта сортировки нет в списку!");
        }
        return answer;
    }

    private int[] sortDescending(int[] array) {
        Arrays.sort(array);
        int[] descArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            descArray[i] = array[(array.length-1)-i];
        }
        return descArray;
    }

    public int[] sortByGrowth(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = -1;
            }
        }
        return array;
    }
    public void cubeTheThirdElement(int[] array){
        for (int i = 2; i < array.length; i += 3){
            array[i] = array[i] * array[i] * array[i];
        }
    }
}
