package ru.ladygin.java.basic.homeworks.homework5;

public class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int endurance;
    protected String status = "Животное в порядке";

    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public void run(int distance) {
        if (distance <= this.endurance) {
            this.endurance -= distance;
            System.out.println("Время бега равно: " + distance / this.speedRun + " с.");
        } else {
            this.endurance = -1;
            this.status = "У животного появилось состояние усталости";
            System.out.println("Время бега равно: " + -1 + "\n" + this.status);
        }
    }

    public void swim(int distance) {
        if (distance <= this.endurance) {
            this.endurance -= distance;
            System.out.println("Время плавания равно: " + distance / this.speedSwim + " с.");
        } else {
            this.endurance = -1;
            this.status = "У животного появилось состояние усталости";
            System.out.println("Время плавания равно: " + -1 + "\n" + this.status);
        }
    }

    public void info() {
        System.out.println("Имя: " + this.name + "\n" + "Текущая выносливость: " + this.endurance + " у.е" + "\n"
                            + "Скорость бега: " + this.speedRun + " m/c" + "\n" + "Скорость плавания: " + this.speedSwim + " m/c" + "\n"
                            + this.status);
    }

}
