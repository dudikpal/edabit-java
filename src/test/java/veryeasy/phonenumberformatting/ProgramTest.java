package veryeasy.phonenumberformatting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    
    @Test
    public void test1() {
        assertEquals(Program.formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }
    
    @Test
    public void test2() {
        assertEquals(Program.formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8}), "(519) 555-4468");
    }
    
    @Test
    public void test3() {
        assertEquals(Program.formatPhoneNumber(new int[]{3, 4, 5, 5, 0, 1, 2, 5, 2, 7}), "(345) 501-2527");
    }
    
    @Test
    public void test4() {
        assertEquals(Program.formatPhoneNumber(new int[]{6, 6, 2, 5, 8, 8, 7, 0, 4, 3}), "(662) 588-7043");
    }
    
    @Test
    public void test5() {
        assertEquals(Program.formatPhoneNumber(new int[]{5, 1, 0, 2, 6, 6, 3, 5, 8, 3}), "(510) 266-3583");
    }
    
    @Test
    public void test6() {
        assertEquals(Program.formatPhoneNumber(new int[]{4, 9, 7, 8, 8, 9, 1, 0, 1, 5}), "(497) 889-1015");
    }
    
    @Test
    public void test7() {
        assertEquals(Program.formatPhoneNumber(new int[]{6, 1, 9, 4, 7, 2, 8, 0, 7, 4}), "(619) 472-8074");
    }
    
    @Test
    public void test8() {
        assertEquals(Program.formatPhoneNumber(new int[]{7, 7, 3, 7, 8, 3, 6, 0, 8, 7}), "(773) 783-6087");
    }
    
    @Test
    public void test9() {
        assertEquals(Program.formatPhoneNumber(new int[]{9, 5, 3, 1, 3, 7, 4, 0, 0, 1}), "(953) 137-4001");
    }
    
    @Test
    public void test10() {
        assertEquals(Program.formatPhoneNumber(new int[]{2, 2, 6, 4, 0, 4, 4, 2, 9, 2}), "(226) 404-4292");
    }

}