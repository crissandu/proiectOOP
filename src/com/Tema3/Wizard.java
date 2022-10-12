package com.Tema3;

public class Wizard extends Fighter {

    private int spells;

    public void prepareSpell() {
        spells++;
    }
    @Override
    boolean isVulnerable() {
        return spells ==0;
    }

    @Override
    int damagePoints(Fighter figher) {
        if(spells == 0) {
            return 3;
        }
        spells--;  // consumam vraja
        return 12;
    }

    @Override
    public String toString() {
        return "Fighter is " + this.getClass().getSimpleName();
    }
}
