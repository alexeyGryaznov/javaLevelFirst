package ru.gb.gryaznov.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
printThreeWords();
checkSummSign();
printColor();
compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSummSign(){
        int first = -10;
        int second = 9;
        int cond = first+second;
        if(cond == 0){
            System.out.println("Сумма равна 0");
        }else {
            if (cond > 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    }
    public static void printColor(){
        int value = 102;
        if(value<=0){
            System.out.println("Красный");
        }else {
            if(value>0 && value<=100){
                System.out.println("Желтый");
            }else {
                System.out.println("зеленый");
            }
        }
    }
    public static void compareNumbers(){
        int a = 3;
        int b = 4;
        if(a>=b){
            System.out.println("a=>b");
        }else{
            System.out.println("a<b");
        }
    }
}
