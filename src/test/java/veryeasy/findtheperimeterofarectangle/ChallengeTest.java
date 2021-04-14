package veryeasy.findtheperimeterofarectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    
    @Test
    public void test1() {
        assertEquals(26, Challenge.findPerimeter(6, 7));
    }
    
    @Test
    public void test2() {
        assertEquals(60, Challenge.findPerimeter(20, 10));
    }
    
    @Test
    public void test3() {
        assertEquals(22, Challenge.findPerimeter(2, 9));
    }

}