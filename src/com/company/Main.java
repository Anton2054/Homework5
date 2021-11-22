package com.company;

public class Main {


    public static void main(String[] args) {
        Boss Dragon = new Boss();
        Dragon.setHealth(1500);
        Dragon.setDamage(100);
        Dragon.setShield("Барьер");
        System.out.println("Dragon:" + Dragon.getHealth() + " XP: " + Dragon.getDamage() + " DD " + Dragon.getShield() + " PP");


    }
}
