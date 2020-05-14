package org.leetcode.question;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TownJudgeTest {

    @Test public void testSomeLibraryMethod() {
        TownJudge townJudge = new TownJudge();
        assertEquals(3, townJudge.findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}));
        assertEquals(1, townJudge.findJudge(1, new int[][] {}));
    }
}
