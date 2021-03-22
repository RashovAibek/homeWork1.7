package com.GeekTek;

public class Medic extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" medic healthes some person on " + superAbilityType + " point ");
    }
}
