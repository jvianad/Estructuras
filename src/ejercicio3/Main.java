package ejercicio3;

/*Escribe un programa en Java que permita almacenar y gestionar una lista de tareas pendientes utilizando ArrayList.
El programa debe permitir al usuario realizar las siguientes acciones:
        • Agregar una tarea a la lista.
        • Marcar una tarea como completada.
        • Mostrar todas las tareas pendientes.
        • Mostrar todas las tareas completadas.
        • Salir del programa.*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<String> tareasPendientes = new ArrayList<>();
        ArrayList<String> tareasCompletadas = new ArrayList<>();

        int opcion = 0;

        do{
            System.out.println("1. Agregar tarea a la lista");
            System.out.println("2. Marcar tarea como completa");
            System.out.println("3. Mostrar las tareas pendientes");
            System.out.println("4. Mostrar tareas completadas");
            System.out.println("5. salir del programa");
            System.out.println("Selecciona una opcion: ");
            opcion = console.nextInt();
            console.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa nombre de tarea: ");
                    String tarea = console.nextLine();
                    tareasPendientes.add(tarea);
                    break;

                case 2:
                    System.out.println("Ingresa indice de tarea a marcar como completa: ");
                    int indice = console.nextInt();

                    if (indice >= 0 && indice < tareasPendientes.size()) {
                        String tareaCompletada = tareasPendientes.remove(indice);
                        tareasCompletadas.add(tareaCompletada);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Tareas pendientes");
                    for (int i = 0; i < tareasPendientes.size();i++){
                        System.out.println(i+". "+tareasPendientes.get(i));
                    }
                    break;

                case 4:
                    System.out.println("Tareas completadas");
                    for (int i = 0; i < tareasCompletadas.size();i++){
                        System.out.println(i+". "+tareasPendientes.get(i));
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida, usa las opciones del menú");
            }

        }while (opcion!=5);

    }
}
