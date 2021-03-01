package com.github.perscholas;
//FireMonster is an instance of Master now.
public class FireMonster implements Monster {
    @Override
    public String attack() {
        //create Logic
        String output="Fire Ball";
        return output;
        //FirsMonster is now Master and able to attack
    }
}
