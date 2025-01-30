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

    @Test
    void testMultiplicar() {
        TablaMultiplicar tablamultiMultiplicar = new TablaMultiplicar();
        int [] resultado = tablamultiMultiplicar.multiplicar(3);
        assertThat(resultado, notNullValue()); // Verifica que la instancia de multiplicar no sea nula   
    }

    @Test
    void testImprimirTabla() {
        TablaMultiplicar tablamultiplciar = new TablaMultiplicar();
        int[] expected = new int[] {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] resultado = tablamultiplciar.multiplicar(3);
        assertThat(resultado, is(expected));
    }
}
