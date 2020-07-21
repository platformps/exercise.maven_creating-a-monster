package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 6/10/2020.
 */
public class WaterMonsterTest {
    @Test
    public void testPolymorphism() {
        // given
        WaterMonster fireMonster = new WaterMonster();

        // when
        Boolean assertion = fireMonster instanceof Monster;

        // then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testAttack() {
        // given
        Monster fireMonster = new WaterMonster();
        String expected = "Water Ball";

        // when
        String actual = fireMonster.attack();

        // then
        Assert.assertEquals(expected, actual);
    }
}
