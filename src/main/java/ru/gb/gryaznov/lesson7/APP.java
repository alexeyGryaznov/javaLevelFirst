package ru.gb.gryaznov.lesson7;

public class APP {
    public static void main(String[] args) {
        Plate plate=new Plate(30);
        Cat[] cats=new Cat[6];
        cats[0]=new Cat("Бегемот", 8, false);
        cats[1]=new Cat("Симба", 4, false);
        cats[2]=new Cat("Пушок", 7, false);
        cats[3]=new Cat("Шустрик", 5, false);
        cats[4]=new Cat("Рыжик", 9, false);
        cats[5]=new Cat("Черныш", 6, false);

        for(int i=0;i< cats.length;i++){
            cats[i].eat(plate);
        }
        plate.info();
        plate.setFood(12);
        plate.info();

    }
}
