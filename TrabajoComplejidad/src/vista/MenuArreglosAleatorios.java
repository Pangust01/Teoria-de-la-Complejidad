package vista;

import java.util.Random;
import java.util.Scanner;

import modelo.ArreglosRandom;
import modelo.MetodosOrdenamiento;

public class MenuArreglosAleatorios extends MetodosOrdenamiento{

    public int[] ArregloAleatorio(Scanner tScanner){
        ArreglosRandom numRandom = new ArreglosRandom();
        Random tamanioRan = new Random();
        tamanioRan.setSeed(30000);
        boolean cerrar = true;
        int[] arregloRan = new int[0];
        do {
            
                System.out.print("""
                    Escoga el tamaño de su arreglo:
                        1. 10
                        2. 20
                        3. 100
                        4. 1000
                        5. 5000
                        6. 10000
                        7. 30000
                        :\t""");
                int option = tScanner.nextInt();
                
                switch (option) {
                    case 1:
                        arregloRan=numRandom.arreglo(10,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 2:
                        arregloRan=numRandom.arreglo(20,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 3:
                        arregloRan=numRandom.arreglo(100,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 4:
                        arregloRan=numRandom.arreglo(1000,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 5:
                        arregloRan=numRandom.arreglo(5000,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 6:
                        arregloRan=numRandom.arreglo(10000,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    case 7:
                        arregloRan=numRandom.arreglo(30000,tamanioRan);
                        System.out.println("Regresando al menu inicial...\nSu arreglo es:");
                        imprime(arregloRan);
                        cerrar=false;
                        break;
                    default:
                        System.out.println("Opcion invalida...\nEscoga un numero del 1 al 7");

                }
                
                
        } while (cerrar);

        return arregloRan;
    }

}
