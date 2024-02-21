package ru.ladygin.java.basic.homeworks.homework3;


public class Homework3 {
    public static void main(String[] args) {
        sumOfPositiveElements(new int[][]{{0,2,0},{1,4,5},{2,0,1}});
        square(16);
        zeroForDiagonals(new int[][]{{0,2,0},{1,4,5},{2,0,1}});
        findMax(new int[][]{{0,2,0},{1,4,5},{2,0,1}});
        sumSecondLine(new int[1][1]);
    }

    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов равна: " + sum);
    }

    public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeroForDiagonals (int[][] array) {
        int tempCell = 0;
        for (int i = 0; i < array.length; i++) {
            array[i][tempCell] = 0;
            tempCell ++;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(array[i][j],max);
            }
        }
        System.out.println("Максимальное значение равно: " + max);
    }

    public static void sumSecondLine (int[][] array) {
        int sum = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        } else {
            sum = -1;
        }
        System.out.println("Сумма элементов второй строки равна: " + sum);
    }
}
