package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(270);
        boss.setBossDamage(50);
        boss.setBossProtectionType("Magical");
        System.out.println("Boss health's: " + boss.getBossHealth() + ";");
        System.out.println("Boss damage's: " + boss.getBossDamage() + ";");
        System.out.println("Boss protection type is: " +
                boss.getBossProtectionType() + ";");
    }
}
