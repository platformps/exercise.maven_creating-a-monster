package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class WaterMonster implements Monster {
    @Override
    public String attack(){
        System.out.println("Water Ball");
        return "Water Ball";
    }
}
