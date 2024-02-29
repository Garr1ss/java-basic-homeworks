package ru.ladygin.java.basic.homeworks.homework4;

public class User {
    private String lastname;
    private String firstname;
    private String patronymic;
    private int year;
    private String email;

    public User(String lastname, String firstname, String patronymic, int year, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void info () {
        System.out.println("ФИО: " + this.lastname + " фамилия " + this.firstname + " имя " + this.patronymic + " отчество " + "\n"
        + "Год рождения: " + this.year + " год рождения" + "\n"
        + "e-mail: " + this.email);
    }
}
