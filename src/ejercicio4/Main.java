package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1. Agregar un contacto a la lista.");
            System.out.println("2. Buscar un contacto por su nombre.");
            System.out.println("3. Actualizar la información de un contacto.");
            System.out.println("4. Eliminar un contacto de la lista.");
            System.out.println("5. Mostrar todos los contactos.");
            System.out.println("6. Salir del programa.");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingresa el email del contacto: ");
                    String email = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono, email);
                    contactos.add(contacto);
                    break;
                case 2:
                    System.out.print("Ingresa el nombre del contacto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contacto c : contactos) {
                        if (c.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println(c);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el índice del contacto a actualizar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    if (indice >= 0 && indice < contactos.size()) {
                        Contacto c = contactos.get(indice);
                        System.out.print("Ingresa el nuevo nombre del contacto (deja en blanco para no cambiar): ");
                        String nuevoNombre = scanner.nextLine();
                        if (!nuevoNombre.isEmpty()) {
                            c.setNombre(nuevoNombre);
                        }
                        System.out.print("Ingresa el nuevo teléfono del contacto (deja en blanco para no cambiar): ");
                        String nuevoTelefono = scanner.nextLine();
                        if (!nuevoTelefono.isEmpty()) {
                            c.setTelefono(nuevoTelefono);
                        }
                        System.out.print("Ingresa el nuevo email del contacto (deja en blanco para no cambiar): ");
                        String nuevoEmail = scanner.nextLine();
                        if (!nuevoEmail.isEmpty()) {
                            c.setEmail(nuevoEmail);
                        }
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.print("Ingresa el índice del contacto a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < contactos.size()) {
                        contactos.remove(indiceEliminar);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 5:
                    System.out.println("Contactos:");
                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.println(i + ". " + contactos.get(i));
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

