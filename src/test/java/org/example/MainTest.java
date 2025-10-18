package org.example;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void obtenerSuma() {

        int VALOR_ESP = 15;

        Main main = new Main();

        int resultado = main.obtenerSuma(5);

        assertEquals(VALOR_ESP, resultado);

    }
}