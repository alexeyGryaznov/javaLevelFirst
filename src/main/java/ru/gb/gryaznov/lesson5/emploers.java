package ru.gb.gryaznov.lesson5;

import java.util.Arrays;

public class emploers {
    private String name, surname, patronimnc, post, email;
    private String phone;
    private int salary;
    private int age;

    public emploers(String surname, String name, String patronimnc, String post, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronimnc = patronimnc;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        emploers[] person = new emploers[5];
        person[0] = new emploers("Иванов", "Иван", "Иванович", "инженер", "ivanovII@mail.ru", "79283014567", 30, 34);
        person[1] = new emploers("Петров", "Алексей", "Иванович", "ст.инженер", "petrovAI@mail.ru", "79292214567", 44, 50);
        person[2] = new emploers("Сидоров", "Иван", "Петрович", "менеджер", "SidorovIP@mail.ru", "79183333367", 50, 43);
        person[3] = new emploers("Васечкина", "Ольга", "Николаевна", "секретарь", "butterflye@mail.ru", "79262017867", 30, 22);
        person[4] = new emploers("Разина", "Любовь", "Валерьевна", "Бухгалтер", "razinaLV@mail.ru", "79283458767", 45, 56);
        printperson(person);
    }
    public static void info(emploers person){//метод печати в консоль данных об объекте
        System.out.println("ФИО: "+ person.surname + " " + person.name + " " + person.patronimnc);
        System.out.println("Должность: " + person.post + " Зарплата: " + person.salary + " Возвраст: " + person.age);
        System.out.println("Почта: " + person.email + " Тел.: " + person.phone);
        System.out.println("---------------------------------------------------------");
    }
public static void printperson(emploers[] person){// метод проверки возвраста с вызовом метода печати в консоль
    for (int i=0;i<5;i++){
        if(person[i].age>=40){
            info(person[i]);
        }
    }

}
}
