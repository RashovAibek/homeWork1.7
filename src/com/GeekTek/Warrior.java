package com.GeekTek;

public class Warrior extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Warrior hit someone on " + superAbilityType + " CRITICAL DAMAGE ");
    }

}

