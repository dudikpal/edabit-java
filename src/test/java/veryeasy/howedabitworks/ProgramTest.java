package veryeasy.howedabitworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    
    @Test
    void hello() {
        
        assertEquals(true, Program.returnTrue());
    }
}