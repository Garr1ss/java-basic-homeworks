package ru.ladygin.java.basic.homeworks.homework2;

import java.util.Arrays;

//Дополнительно сделал вызов методов в main для наглядности, знаю что в задаче этого нет
//Методы сознательно так названы, что бы в проверке было понятно какой из них какое задание

public class Homework2 {
    public static void main(String[] args) {
        firstTask(6, "Test");
        secondTask(new int[]{8, 4, 1, 2, 11});
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        thirdTask(12, array);
        fourthTask(4, array);
        fifthTask(new int[]{3,4,1,5});
        sixthTask(new int[]{1,1,1}, new int[]{2,0,3,1}, new int[]{0,0,0,8,8});
        ninthTask(new int[]{1,2,3,4});
    }

    public static void firstTask(int count, String text){
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void secondTask(int[] group) {
        int temp = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] > 5) {
                temp += group[i];
            }
        }
        System.out.println(temp);
    }

    public static void thirdTask(int number, int[] array) {
        Arrays.fill(array, number);
        System.out.println(Arrays.toString(array));
    }

    public static void fourthTask(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fifthTask(int[] array) {
        int firstHalf = 0, secondHalf = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length/2; i++) {
                firstHalf += array[i];
            }
            for (int i = array.length/2; i < array.length; i++) {
                secondHalf +=array[i];
            }
            System.out.println(firstHalf > secondHalf ? "Сумма первой половины массива больше": "Сумма второй половины массива больше");
        } else {
            System.out.println("Массив не четный");
        }
    }

    public static void sixthTask(int[] arrayFirst, int[] arraySecond, int[] arrayThird) {
        int maxLength = Math.max(arrayFirst.length, arraySecond.length);
        maxLength = Math.max(maxLength, arrayThird.length);
        int[] resultArray = new int[maxLength];
        int[] tempArrayFirst = arrayFirst.length<maxLength?Arrays.copyOf(arrayFirst,maxLength):arrayFirst;
        int[] tempArraySecond = arraySecond.length<maxLength?Arrays.copyOf(arraySecond,maxLength):arraySecond;
        int[] tempArrayThird = arrayThird.length<maxLength?Arrays.copyOf(arrayThird,maxLength):arrayThird;
        for (int i = 0; i < maxLength; i++) {
            resultArray[i] += tempArrayFirst[i];
            resultArray[i] += tempArraySecond[i];
            resultArray[i] += tempArrayThird[i];
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static void ninthTask(int[] array) {
        int[] arrayTemp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayTemp[i] = array[array.length - i - 1];
        }
        array = arrayTemp;
        System.out.println(Arrays.toString(array));
    }
}
