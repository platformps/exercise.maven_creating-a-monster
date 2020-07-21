package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class WaterMonster implements Monster {
    String attackMode = "Water Ball";

    @Override
    public String attack() {
        return attackMode;
    }
}
