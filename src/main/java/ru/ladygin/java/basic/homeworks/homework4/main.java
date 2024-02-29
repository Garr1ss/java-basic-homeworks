package ru.ladygin.java.basic.homeworks.homework4;

import org.apache.commons.lang3.RandomStringUtils;

public class main {
    public static void main(String[] args) {
        User[] user = new User[10];
        for (int i = 0; i < user.length; i++) {
            user[i] = new User(RandomStringUtils.randomAlphanumeric(5), RandomStringUtils.randomAlphanumeric(5), RandomStringUtils.randomAlphanumeric(5), 1950 + ((int) (Math.random() * 73) + 1), RandomStringUtils.randomAlphanumeric(5));
            if (user[i].getYear() >= 1983) {
                user[i].info();
            }
        }

        Box box = new Box(12, "blue");
        box.info();
        box.openBox();
        box.info();
        box.putIn("Яблоко");
        box.info();
    }
}
