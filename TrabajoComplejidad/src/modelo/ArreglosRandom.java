package modelo;

import java.util.Random;

public class ArreglosRandom {
    public int[] arreglo(int tamanio,Random numRandom) {
        int[] numero = new int[tamanio];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=numRandom.nextInt(100);
        }
        return numero;

    }
}
