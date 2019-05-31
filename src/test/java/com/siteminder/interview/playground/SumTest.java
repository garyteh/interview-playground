package com.siteminder.interview.playground;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Given an array of integers,return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution,and you may not use the same element twice.
 */
public class SumTest extends BaseTest {

    private Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test(timeout = 50L)
    public void bruteForce() {
        assertThat(sum.sum(NUM_1, 9)).containsOnlyOnce(0, 1);
    }

    @Test(timeout = 50L)
    public void linear() {
        assertThat(sum.sum(NUM_2, 11_125_420)).containsOnlyOnce(12237, 105332);
    }
}
