package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Ingresa tamaño del tablero de juego: ");
        int N = console.nextInt();

        char [][] tablero = new char[N][N];

        //inicializar con agua
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tablero[i][j] = 'A';
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }

        System.out.println("");

        System.out.println("Ingresa la cantidad de barcos a ingresar: ");
        int numBarcos = console.nextInt();

        System.out.println("Coloca tus barcos en el tablero.");
        for (int i = 0; i < numBarcos; i++) {
            System.out.println("Barco " + (i + 1) + ":");
            System.out.print("Coordenada x de inicio: ");
            int xInicio = console.nextInt();
            System.out.print("Coordenada y de inicio: ");
            int yInicio = console.nextInt();
            System.out.print("Coordenada x de fin: ");
            int xFin = console.nextInt();
            System.out.print("Coordenada y de fin: ");
            int yFin = console.nextInt();
            System.out.print("Dirección (H/V): ");
            char direccion = console.next().charAt(0);

            if (direccion == 'H' || direccion == 'h') {
                for (int j = yInicio; j <= yFin; j++) {
                    if (xInicio < 0 || xInicio >= numBarcos || j < 0 || j >= numBarcos || tablero[xInicio][j] == 'B') {
                        System.out.println("Error al colocar el barco. Inténtalo de nuevo.");
                        i--;
                        break;
                    } else {
                        tablero[xInicio][j] = 'B';
                    }
                }
            } else if (direccion == 'V' || direccion == 'v') {
                for (int j = xInicio; j <= xFin; j++) {
                    if (j < 0 || j >= numBarcos || yInicio < 0 || yInicio >= numBarcos || tablero[j][yInicio] == 'B') {
                        System.out.println("Error al colocar el barco. Inténtalo de nuevo.");
                        i--;
                        break;
                    } else {
                        tablero[j][yInicio] = 'B';
                    }
                }
            } else {
                System.out.println("Dirección inválida. Inténtalo de nuevo.");
                i--;
            }
        }

        int intentos = 5;
        while (intentos > 0) {
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Coordenada x para atacar: ");
            int xAtaque = console.nextInt();
            System.out.print("Coordenada y para atacar: ");
            int yAtaque = console.nextInt();
            if (tablero[xAtaque][yAtaque] == 'B') {
                System.out.println("¡Barco tocado!");
                tablero[xAtaque][yAtaque] = 'T';

                boolean ganador = true;

                for (int i = 0; i < numBarcos; i++) {
                    for (int j = 0; j < numBarcos; j++) {
                        if (tablero[i][j] == 'B') {
                            ganador = false;
                            break;
                        }
                    }
                }
                if (ganador) {
                    System.out.println("¡Felicidades, has ganado el juego!");
                    break;
                }
            } else if (tablero[xAtaque][yAtaque] == 'A') {
                System.out.println("Agua tocada.");
                tablero[xAtaque][yAtaque] = 'F';
            } else {
                System.out.println("Ya has atacado esa posición. Inténtalo de nuevo.");
                continue;
            }
            intentos--;
        }
        if (intentos == 0) {
            System.out.println("Lo siento, has perdido el juego.");
        }


    }
}



