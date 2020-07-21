package com.github.perscholas;

public class FireMonster implements Monster{
    @Override
    public String attack(){
        System.out.println("Fire Ball");
        return "Fire Ball";
    }
}
