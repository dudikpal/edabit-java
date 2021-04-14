package easy.capturetherook;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {
    
    @Test
    public void test1() {
        assertTrue(Challenge.canCapture(new String[]{"A8", "E8"}));
    }
    
    @Test
    public void test2() {
        assertFalse(Challenge.canCapture(new String[]{"A1", "B2"}));
    }
    
    @Test
    public void test3() {
        assertTrue(Challenge.canCapture(new String[]{"H4", "H3"}));
    }
    
    @Test
    public void test4() {
        assertFalse(Challenge.canCapture(new String[]{"F5", "C8"}));
    }
    
    @Test
    public void test5() {
        assertTrue(Challenge.canCapture(new String[]{"G3", "G7"}));
    }
    
    @Test
    public void test6() {
        assertTrue(Challenge.canCapture(new String[]{"B3", "B2"}));
    }
    
    @Test
    public void test7() {
        assertFalse(Challenge.canCapture(new String[]{"F5", "B2"}));
    }
    
    @Test
    public void test8() {
        assertFalse(Challenge.canCapture(new String[]{"H5", "C8"}));
    }
    
}