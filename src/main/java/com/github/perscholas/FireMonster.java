package com.github.perscholas;

public class FireMonster implements Monster{
    String attackMode="Fire Ball";
    @Override
    public String attack() {
        return attackMode;
    }

}

