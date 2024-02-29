package ru.ladygin.java.basic.homeworks.homework4;

public class Box {
    private final int size;
    private String color;
    private boolean openStatus;
    private String object;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.openStatus = false;
        this.object = null;
    }

    public void openBox() {
        this.openStatus = true;
        System.out.println("Коробка открыта");
    }

    public void closeBox() {
        this.openStatus = false;
        System.out.println("Коробка закрыта");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Новый цвет: " + this.color);
    }

    public void putIn(String object) {
        if (this.openStatus && this.object == null) {
            this.object = object;
            System.out.println("Теперь в коробке лежит: " + this.object);
        } else {
            System.out.println("Коробка закрыта или в ней уже что то лежит");
        }
    }

    public void putOut() {
        if (this.openStatus && this.object != null) {
            this.object = null;
            System.out.println("Теперь в коробке пусто");
        } else {
            System.out.println("Коробка закрыта или в ней ничего нет");
        }
    }

    public void info() {
        System.out.println("=====" + "\n"
                            + "Цвет коробки: " + this.color + "\n"
                            + "Размер коробки: " + this.size + "\n"
                            + "Статус коробки: " + (this.openStatus?"открыта":"закрыта") + "\n"
                            + (this.object==null?"Коробка пустая":"В коробке лежит: " + this.object) + "\n"
                            + "=====");
    }
}
