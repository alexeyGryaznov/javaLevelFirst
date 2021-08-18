package ru.gb.gryaznov.lesson6;

public class catdogAPP {

    public static void main(String[] args) {
        Animal Stasik = new Dog("Стасик",2);
        Dog Maylo = new Dog("Майло", 4);
        Dog Puh=new Dog("Пушок",5);
        Dog Bob=new Dog("боб",6);
        Cat Murlo = new Cat("Мурзик", 7);
        Cat Stepa = new Cat("Степан", 3);
        Animal Boris = new Cat("Борис", 8);
        Animal Panda=new Animal("Панда");
        Animal begemot=new Animal("Вилли");
        Stasik.running(300);
        Maylo.running(555);
        Bob.running(250);
        Puh.running(700);
        Puh.swiming(12);
        Murlo.running(20);
        Murlo.swiming(2);
        Panda.swiming(20);
        Panda.running(800);
        Stepa.running(240);
        System.out.println("Всего животных создано: "+ Panda.getCheckNumAnim());
        System.out.println("из них: ");
        System.out.println("Собак создано: "+ Maylo.getCheckNum());
        System.out.println("Кошек создано: "+ Murlo.getCheckNum());
        System.out.println("Других видов: "+ (Panda.getCheckNumAnim()-Murlo.getCheckNum()-Maylo.getCheckNum()));
    }

}
