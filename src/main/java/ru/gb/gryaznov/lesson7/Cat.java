package ru.gb.gryaznov.lesson7;

public class Cat {
    private String name;
    private int apetite;
    private boolean satiety;
    public Cat(String name, int apetite, boolean satiety){
        this.name=name;
        this.apetite=apetite;
        this.satiety=false;
    }
    public void eat(Plate p){
        if(p.getFood()>=apetite) {
            p.decreaseFood(apetite);
            this.satiety = true;
            System.out.println(this.name +"("+this.apetite + ")" + " поел: - " + this.satiety + " осталось.еды: " + p.getFood());
        }else {
            System.out.println(this.name +"("+this.apetite + ")" + " поел: - " + this.satiety + " осталось.еды: " + p.getFood());
        }
    }

}
