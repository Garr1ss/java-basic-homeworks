package ru.ladygin.java.basic.homeworks.homework5;

public class Cat extends Animal{
    final int speedSwim = 0;
    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты плавать не умеют");
    }

    @Override
    public void info() {
        System.out.println("Имя: " + this.name + "\n" + "Текущая выносливость: " + this.endurance + " у.е" + "\n"
                + "Скорость бега: " + this.speedRun + " m/c" + "\n" + "Скорость плавания: " + this.speedSwim + " m/c" + " ведь коты плавать не умеют" + "\n"
                + this.status);
    }
}
