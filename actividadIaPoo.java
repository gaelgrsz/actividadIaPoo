import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoInsercionMenu {

    public static void ordenamientoPorInsercion(int[] A) {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            int clave = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > clave) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = clave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = null;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingresar arreglo");
            System.out.println("2. Ordenar por inserción");
            System.out.println("3. Mostrar arreglo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos elementos deseas ingresar?: ");
                    int n = scanner.nextInt();
                    arreglo = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento [" + i + "]: ");
                        arreglo[i] = scanner.nextInt();
                    }
                    System.out.println("Arreglo cargado correctamente.");
                    break;

                case 2:
                    if (arreglo == null) {
                        System.out.println("Primero debes ingresar los datos (Opción 1).");
                    } else {
                        ordenamientoPorInsercion(arreglo);
                        System.out.println("Arreglo ordenado con éxito.");
                    }
                    break;

                case 3:
                    if (arreglo == null) {
                        System.out.println("No hay datos cargados.");
                    } else {
                        System.out.println("Arreglo actual: " + Arrays.toString(arreglo));
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}