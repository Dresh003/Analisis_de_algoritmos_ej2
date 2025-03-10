package analisisdealgoritmos2;

import java.util.Scanner;

public class Analisisdealgoritmos2 {

    public static void main(String[] args) {
        // Registrar el tiempo inicial
        long tiempoInicial = System.nanoTime();

        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un array para almacenar los números
        int[] numeros = new int[n];

        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números pares ingresados
        System.out.print("Números pares ingresados: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); // Salto de línea para mejor visualización

        // Llamar a la función sumPair y mostrar el resultado
        int paresSumados = sumPair(numeros);
        System.out.println("Cantidad de pares cuya suma es par: " + paresSumados);

        // Registrar el tiempo final
        long tiempoFinal = System.nanoTime();

        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

        // Mostrar el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);
    }

    public static int sumPair(int[] v) {
        int result = 0;
        int n = v.length; // Obtener la longitud del array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Verificar si la suma es par
                if ((v[i] + v[j]) % 2 == 0) {
                    result = result + 1;
                }
            }
        }
        return result;
    }
}
