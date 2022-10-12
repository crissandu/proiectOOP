package com.Tema3;

public class Warrior extends Fighter {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        wizard.prepareSpell();
        System.out.println("Damage points " + warrior.damagePoints(wizard));
        System.out.println("Damage points " + wizard.damagePoints(warrior));
        System.out.println("==================================");
        System.out.println("Damage points " + warrior.damagePoints(wizard));
        System.out.println("Damage points " + wizard.damagePoints(warrior));
        wizard.prepareSpell();
        System.out.println("==================================");
        System.out.println("Damage points " + warrior.damagePoints(wizard));
        System.out.println("Damage points " + wizard.damagePoints(warrior));

    }


    @Override
    int damagePoints(Fighter figher) {
        return figher.isVulnerable() ? 10:6;
    }

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }


}
