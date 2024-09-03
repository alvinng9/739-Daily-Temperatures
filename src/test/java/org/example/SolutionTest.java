package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void dailyTemperaturesTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0},
                solution.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
        assertArrayEquals(new int[]{1,1,1,0},
                solution.dailyTemperatures(new int[]{30,40,50,60}));
        assertArrayEquals(new int[]{1,1,0},
                solution.dailyTemperatures(new int[]{30,60,90}));
    }

}