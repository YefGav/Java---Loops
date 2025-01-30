package de.yeferson.java_loops;

public class TablaMultiplicar {

    private int n;
    
    public TablaMultiplicar(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

        public int[]  multiplicar(int n) {
        int[] resultado = new int[10];
        for (int i = 0; i < 10; i++) {
            resultado[i] = n * (i + 1);
        }

        return resultado;
    }

}



