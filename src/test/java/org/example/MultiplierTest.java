package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    void mulitple() {
        Multiplier m = new Multiplier();
        assertEquals(m.mulitple(4,2), 8);
    }

    @Test
    void double_multiple() {
        Multiplier m = new Multiplier();
        assertEquals(m.double_multiple(4,2), 16);
    }
}