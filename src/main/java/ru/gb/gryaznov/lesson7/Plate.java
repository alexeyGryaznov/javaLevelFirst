package ru.gb.gryaznov.lesson7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }
    public void info(){
        System.out.println("колич. еды в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }
    public void setFood(int Food){
        System.out.println("положим еды в тарелку: " + Food);
        this.food=Food;
    }
    public void decreaseFood(int decrease) {
                food = food - decrease;
    }
}
