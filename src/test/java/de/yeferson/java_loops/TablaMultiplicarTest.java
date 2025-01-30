package de.yeferson.java_loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {

    @Test
    @DisplayName("Verifica el valor de n")

    void testGetN() {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar(3);
        assertThat(tablaMultiplicar.getN(), is(3)); // Verifica el valor de n
    }
    @Test
    @DisplayName("Verifica que la instancia de multiplicar no sea nula")

    void testInicio() {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar(3);
        assertThat(tablaMultiplicar, is(notNullValue())); // Verifica que la instancia de multiplicar no sea nula
        assertThat(tablaMultiplicar, instanceOf (TablaMultiplicar.class));// Verifica que la instancia de multiplicar sea de la clase TablaMultiplicar
    }

    @Test
    void testMultiplicar() {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar(3);
        int [] resultado = tablaMultiplicar.multiplicar(3);
        assertThat(resultado, notNullValue()); // Verifica que la instancia de multiplicar no sea nula   
    }

    @Test
    void testImprimirTabla() {
        TablaMultiplicar tablamultiplicar = new TablaMultiplicar(3);
        int[] expected = new int[] {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] resultado = tablamultiplicar.multiplicar(3);
        assertThat(resultado, is(expected));
    }
}
