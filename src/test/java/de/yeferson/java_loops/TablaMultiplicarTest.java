package de.yeferson.java_loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {

    @Test
    @DisplayName("Verifica que la instancia de multiplicar no sea nula")

    void testInicio() {
        TablaMultiplicar tablamultiMultiplicar = new TablaMultiplicar();
        assertThat(tablamultiMultiplicar, is(notNullValue())); // Verifica que la instancia de multiplicar no sea nula
        assertThat(tablamultiMultiplicar, instanceOf (TablaMultiplicar.class));// Verifica que la instancia de multiplicar sea de la clase TablaMultiplicar
    }

    testMultiplicar() {
        TablaMultiplicar tablamultiMultiplicar = new TablaMultiplicar();
        int [] resultado = tablamultiMultiplicar.multiplicar(2);
        assertThat(tablamultiMultiplicar, is(notNullValue())); // Verifica que la instancia de multiplicar no sea nula
        
    }
}
