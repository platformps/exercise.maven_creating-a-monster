package com.github.perscholas;

public class ApplicationRunner implements Runnable {
    public void run() {
        animateMonster((Monster)new FireMonster()); //The FireMonster object assigned to a Monster type variable
        animateMonster((Monster)new WaterMonster());
        animateMonster((Monster)new StoneMonster());
    }

    private void animateMonster(Monster monster) {  //a method for all the concrete classes for the monster interface
        String monsterType = monster.getClass().getSimpleName();
        System.out.println(monsterType + " has been created!");

        String attackOutput = monster.attack();
        System.out.println("A " + monsterType + " has attacked.");
        System.out.println("The attack performed was " + attackOutput);
    }
}
