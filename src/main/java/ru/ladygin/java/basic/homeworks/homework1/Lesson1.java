package ru.ladygin.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int choice = scanner.nextInt();

        Random random = new Random();

        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            checkSign((int)(Math.random() * 20), (int)(Math.random() * 10), (int)(Math.random() * 30));
        } else if (choice == 3) {
            selectColor();
        } else if (choice == 4) {
            compareNumbers();
        } else if (choice == 5) {
            addOrSubtractAndPrint((int)(Math.random() * 10), (int)(Math.random() * 20), random.nextBoolean());
        } else {
            System.out.println("Попросил же, от 1 до 5");
        }


    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 8;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 14;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
