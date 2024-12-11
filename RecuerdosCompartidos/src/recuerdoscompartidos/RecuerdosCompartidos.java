package recuerdoscompartidos;

import java.util.ArrayList;
import java.util.Scanner;

public class RecuerdosCompartidos {
    public static void main(String[] args) {
        // **Arreglos que contienen los recuerdos de David y María
        String[] recuerdosDavid = {"caminar juntos", "volver juntos a casa", "jugar baloncesto", 
                                   "cantar", "mirar una peli", "ir de compras"};

        String[] recuerdosMaria = {"comer en un restaurante", "bailar", "nuestro aniversario",  
                                   "ir al cine", "viajar a la playa", "estudiar"};

        // Crear una lista para guardar los recuerdos combinados
        ArrayList<String> recuerdosCombinados = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario qué recuerdos desea combinar
        System.out.println("Ingrese las posiciones de los recuerdos de David que desea combinar (separados por comas):");
        String[] posicionesDavid = scanner.nextLine().split(",");

        System.out.println("Ingrese las posiciones de los recuerdos de María que desea combinar (separados por comas):");
        String[] posicionesMaria = scanner.nextLine().split(",");

        // Agregar los recuerdos seleccionados de David
        for (String pos : posicionesDavid) {
            try {
                int index = Integer.parseInt(pos.trim());
                if (index >= 0 && index < recuerdosDavid.length) {
                    recuerdosCombinados.add(recuerdosDavid[index]);
                } else {
                    System.out.println("La posición " + index + " no existe en los recuerdos de David.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + pos.trim());
            }
        }

        // Agregar los recuerdos seleccionados de María
        for (String pos : posicionesMaria) {
            try {
                int index = Integer.parseInt(pos.trim());
                if (index >= 0 && index < recuerdosMaria.length) {
                    recuerdosCombinados.add(recuerdosMaria[index]);
                } else {
                    System.out.println("La posición " + index + " no existe en los recuerdos de María.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + pos.trim());
            }
        }

        // Imprimir los recuerdos combinados
        System.out.println("\nLa combinación de los recuerdos seleccionados es: " + String.join(" y ", recuerdosCombinados));

        scanner.close();
    }
}
