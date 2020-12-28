package com.hrynevych.designpatterns.behavioral.memento;

public class Save {
    private final String name;
    private final int level;
    private final int maxHealth;
    private final int money;

    public Save(String name, int level, int maxHealth, int money) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.money = money;
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
}
