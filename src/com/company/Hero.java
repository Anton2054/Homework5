package com.company;

public class Hero {
    private int health;
    private int damage;
    private String power;

    public Hero(int health, int damage, String power) {
        this.health = health;
        this.damage = damage;
        this.power = power;
    }

    public Hero(int health, int damage, String superpower, String superman) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }

}

