package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //definimos
        int [][] array1 = new int[3][3];
        int [][] array2 = new int[3][3];

        if (Arrays.deepEquals(array1,array2)){
            //rellenamos
            for (int i = 0; i < 3 ; i++){
                for (int j = 0; j < 3 ; j++){
                    System.out.println("Elemento "+i+","+j+" de matriz 1: ");
                    array1[i][j] = console.nextInt();
                }
            }

            for (int i = 0; i < 3 ; i++){
                for (int j = 0; j < 3 ; j++){
                    System.out.println("Elemento "+i+","+j+" de matriz 2: ");
                    array2[i][j] = console.nextInt();
                }
            }
        }else {
            System.out.println("Diferentes tamaños, finalizando programa");
        }

        //matriz suma y mostramos valores
        int [][] arrayrS = new int[3][3];

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3 ; j++){
                arrayrS[i][j] = array1[i][j]+array2[i][j];
                System.out.print(arrayrS[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
