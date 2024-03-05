package ru.ladygin.java.basic.homeworks;

import ru.ladygin.java.basic.homeworks.homework5.Cat;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat("Puma", 1, 2, 10);
        cat.info();
        cat.run(2);
        cat.info();
        cat.swim(4);
        cat.info();
        cat.swim(12);
        cat.info();
    }
}
