package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numMasGrande = 0;
        int numMasPequeño = 10000000;

        System.out.println("Tamaño del array: ");
        int tamanioLista = console.nextInt();
        int [] arrayNs = new int[tamanioLista];

        for (int i = 0; i < tamanioLista;i++){
            System.out.println("Ingresa numero de la posicion "+i);
            arrayNs[i] = console.nextInt();
        }

        for (int i = 0; i < tamanioLista;i++){
            if (arrayNs[i] > numMasGrande){
                numMasGrande = arrayNs[i];
            }
        }

        for (int i = 0; i < tamanioLista;i++){
            if (arrayNs[i] < numMasPequeño){
                numMasPequeño = arrayNs[i];
            }
        }

        System.out.println("El numero mas grande es: "+numMasGrande);
        System.out.println("El numero mas grande es: "+numMasPequeño);

    }
}
