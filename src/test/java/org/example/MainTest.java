package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum() {
        Main m = new Main();
        assertEquals(m.sum(2,3), 5);
    }

    @Test
    void cha() {
        Main m = new Main();
        assertEquals(m.cha(6,3), 3);
    }
}