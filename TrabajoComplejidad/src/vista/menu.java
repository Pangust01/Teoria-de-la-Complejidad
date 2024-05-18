package vista;

import java.util.Scanner;

import modelo.MetodosOrdenamiento;

public class menu {
    public void menuInicial(){
        MenuArreglosAleatorios MenAlea = new MenuArreglosAleatorios();
        MetodosOrdenamiento Met = new MetodosOrdenamiento();
        boolean condition = true;
        int[] arregloRan = new int[0];
        Scanner teclado;

        do {
            teclado = new Scanner(System.in);
            System.out.print("""
                Bienvenidos al menu de arreglos aleatorios: (Escoga del 0 al 2)
                    1. Generar Arreglos con elementos con diferente tamaño
                    2. Ordenar por los 3 metodos
                    0. Salir
                    :\t""");
            int op = teclado.nextInt();
            switch (op) {
                case 1:
                    arregloRan=MenAlea.ArregloAleatorio(teclado);
                    break;
                case 2: 
                if (arregloRan.length==0) {
                    System.out.println("No tiene un arreglo generado...\nCree primeramente un arreglo");
                } else {
                    System.out.println("\nArreglo a ordenar:");
                    Met.imprime(arregloRan);
                    Met.burbujaMejorado(arregloRan, condition);
                    Met.insertionSort(arregloRan, condition);
                    Met.metodoSeleccion(arregloRan, condition);
                    
                }
                    break;
                case 0:
                    System.out.println("Salio del programa...");
                    condition = false;
                    break;

                default:
                    System.out.println("Opcion invalida...\nEscoga un numero del 0 al 2");
                    
            }
        } while (condition);
        teclado.close();
    }
}
