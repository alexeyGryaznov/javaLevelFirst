package ru.gb.gryaznov.lesson6;

public class Animal {
    private String name;
    public static int checkNumAnim;

public Animal(String name){
    this.name=name;
    setCheckNumAnim();

}
    public void setCheckNumAnim() {
        this.checkNumAnim = checkNumAnim+1;
    }
    public int getCheckNumAnim(){
        return checkNumAnim;
    }
public void running(int run){
    System.out.println(this.name + " пробежал: "+ run+ " метров");
}
    public void swiming(int swim){
        System.out.println(this.name + " проплыл: "+ swim + " метров");
    }
}
