package modelo;

import java.util.Arrays;

public class MetodosOrdenamiento {
    private double inicio;
    private double fin;
    // Bucle insercion
    public int[] insertionSort(int[] numeros, boolean ascendente) {
        int tamanio = numeros.length;
        int[] arregloOrdenar = Arrays.copyOf(numeros, tamanio);
        System.out.println("\nMetodo Insercion>");
        inicio = System.nanoTime();
        for (int i = 1; i < tamanio; i++) {
            int elementoActual = arregloOrdenar[i];
            int j = i - 1;
            while (j >= 0 && (ascendente ? arregloOrdenar[j] > elementoActual : arregloOrdenar[j] < elementoActual)) {
                arregloOrdenar[j + 1] = arregloOrdenar[j];
                j--;
            }
            arregloOrdenar[j + 1] = elementoActual;
        }
        fin = System.nanoTime();
        double tiempoSeg = ((fin - inicio) * 1e-9);
        System.out.println("\nSu tiempo en que se demoro el metodo insercion en arreglar en segundos es: \n" + tiempoSeg + " seg\n");
        imprime(arregloOrdenar);
        return arregloOrdenar;
    }

    // Bucle Seleccion
    public int[] metodoSeleccion(int[] numeros, boolean ascendente) {
        int tamanio = numeros.length;
        int[] arregloOrdenar = Arrays.copyOf(numeros, tamanio);
        System.out.println("\nMetodo Seleccion>");
        inicio = System.nanoTime();
        for (int i = 0; i < tamanio - 1; i++) {
            int index_menor = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (ascendente ? arregloOrdenar[j] < arregloOrdenar[index_menor]
                        : arregloOrdenar[j] > arregloOrdenar[index_menor]) {
                    index_menor = j;
                }
            }
            if (index_menor != i) {
                int temp = arregloOrdenar[i];
                arregloOrdenar[i] = arregloOrdenar[index_menor];
                arregloOrdenar[index_menor] = temp;
            }
        }
        fin = System.nanoTime();
        double tiempoSeg = ((fin - inicio) * 1e-9);
        System.out.println("\nSu tiempo en que se demoro el metodo seleccion en arreglar en segundos es: \n" + tiempoSeg + " seg\n");
        imprime(arregloOrdenar);
        return arregloOrdenar;
    }

    // Metodo Burbuja Mejorado
    public int[] burbujaMejorado(int[] numeros, boolean asendente) {
        int bandera = 0;
        int aux;
        int tamRestando = numeros.length;
        int i = 0;
        int[] arregloOrdenar = Arrays.copyOf(numeros, numeros.length);
        System.out.println("\nMetodo Burbuja Mejorado>");
        inicio = System.nanoTime();
        do {
            for (int j = i + 1; j < tamRestando; j++) {
                if (asendente ? arregloOrdenar[i] > arregloOrdenar[j] : arregloOrdenar[i] < arregloOrdenar[j]) {
                    aux = arregloOrdenar[i];
                    arregloOrdenar[i] = arregloOrdenar[j];
                    arregloOrdenar[j] = aux;
                }
                i++;
            }
            for (i = 0; i < arregloOrdenar.length-1; i++) {
                int k = i + 1;
                if (asendente ? arregloOrdenar[i] > arregloOrdenar[k] : arregloOrdenar[i] < arregloOrdenar[k]) {
                    bandera = 1;
                    break;
                }
            } 
            tamRestando--;
            i = 0;
        } while (bandera == 0);
        fin = System.nanoTime();
        double tiempoSeg = ((fin - inicio) * 1e-9);
        System.out.println("\nSu tiempo en que se demoro el metodo burbuja mejorado en arreglar en segundos es: \n" + tiempoSeg + " seg\n");
        imprime(arregloOrdenar);
        return arregloOrdenar;
    }

    // Método para imprimir un arreglo
    public void imprime(int[] arreglo) {
        String salida = "[";
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length - 1) {
                salida += arreglo[i] + ", ";
            } else {
                salida += arreglo[i];
            }
        }
        System.out.println(salida + "]");
    }
}
