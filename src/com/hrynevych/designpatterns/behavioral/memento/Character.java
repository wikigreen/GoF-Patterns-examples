package com.hrynevych.designpatterns.behavioral.memento;

public class Character {
    private String name;
    private int level;
    private int maxHealth;
    private int money;

    public Character(){

    }

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.maxHealth = 10;
        this.money = 0;
    }

    public Save save(){
        return new Save(name, level, maxHealth, money);
    }

    public Character loadSave(Save save){
        this.name = save.getName();
        this.money = save.getMoney();
        this.level = save.getLevel();
        this.maxHealth = save.getMaxHealth();
        return this;
    }


    public void lvlUp(){
        level++;
        maxHealth = (int) Math.pow((level*10), 2);
        money += 100 * level;
    }

    public void buySomething(int price){
        money -= price;
    }

    public void receiveMoney(int money){
        this.money += money;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", maxHealth=" + maxHealth +
                ", money=" + money +
                '}';
    }
}
