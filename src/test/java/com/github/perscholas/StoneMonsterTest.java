package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 6/10/2020.
 */
public class StoneMonsterTest {
    @Test
    public void testPolymorphism() {
        // given
        StoneMonster fireMonster = new StoneMonster();

        // when
        Boolean assertion = fireMonster instanceof Monster;

        // then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testAttack() {
        // given
        StoneMonster stoneMonster = new StoneMonster();
        String expected = "Rock";

        // when
        String actual = stoneMonster.attack();

        // then
        Assert.assertEquals(expected, actual);
    }
}
