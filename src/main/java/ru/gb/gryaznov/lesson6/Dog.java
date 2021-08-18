package ru.gb.gryaznov.lesson6;

import java.util.Random;

public class Dog extends Animal{
    private int age;
    private String name;
    public static int checkNum;

    public Dog(String name,int age){
        super(name);
        this.name=name;
        this.age=age;
        setCheckNum();
    }


    public void setCheckNum() {
        this.checkNum = checkNum+1;
    }
    public int getCheckNum(){
        return checkNum;
    }

    @Override
    public void running(int run){
        if(run<=500){
        System.out.println(this.name + " пробежал: "+ run + " метров");

        }else {
            System.out.println(this.name + " пробежал: " + "500 метров и прополз еще "+(run-500) + " метров");
        }
    }
    @Override
    public void swiming(int swim){
        if(swim<=10){
            System.out.println(this.name + " проплыл: "+ swim + " метров");
        }else {
            Random rand = new Random();
            int swimPossibility=10+rand.nextInt(this.age);
            System.out.println(this.name + " проплыл: "+ swimPossibility + " метров и утонул");
        }
    }
}
