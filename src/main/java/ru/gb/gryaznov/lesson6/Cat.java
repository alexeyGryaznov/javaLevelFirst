package ru.gb.gryaznov.lesson6;

import java.util.Random;

public class Cat extends Animal {
    private int age;
    private String name;
    public static int checkNum;
    public int deadCat, lazyCat, strongCat;
    public Cat(String name,int age){
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
        if(run<=200){
            System.out.println(this.name + " пробежал: "+ run + " метров");
            deadCat=deadCat+1;
        }else {
            Random rand = new Random();
            int runPossibility=rand.nextInt(this.age);
            System.out.println(this.name + " пробежал: " + " 200 метров и прополз еще "+ runPossibility + " метров");
        }
    }
    @Override
    public void swiming(int swim){
        System.out.println(this.name+" Говорит: Коты не плавают");
    }
    public void checkCats(){
        System.out.println(deadCat);
    }
}
