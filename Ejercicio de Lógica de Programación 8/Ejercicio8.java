package Ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array de tamaño 10 para almacenar los números ingresados.
        int[] numeros = new int[10]; 

        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            
        	// Almacenar numeros en el array 'numeros'.
        	numeros[i] = sc.nextInt(); 
        }

        // Array para almacenar los números primos.
        int[] primos = new int[10]; 
        
        // Array para almacenar los números no primos.
        int[] noPrimos = new int[10]; 
        
        // Contador para los números primos.
        int contadorPrimos = 0; 
        
        // Contador para los números no primos.
        int contadorNoPrimos = 0; 

        for (int i = 0; i < 10; i++) {
            // Verificar si el número es primo utilizando la función 'esPrimo'.
        	if (esPrimo(numeros[i])) { 
        		
                // Si es primo, almacenar número en el array 'primos'.
        		primos[contadorPrimos] = numeros[i]; 
        		
                // Incremento del contador de números primos.
        		contadorPrimos++; 
        		
            } else {
            	
                // Si no es primo, almacenar número en el array 'noPrimos'.
            	noPrimos[contadorNoPrimos] = numeros[i]; 
            	
                // Incrementar el contador de números no primos.
            	contadorNoPrimos++; 
            }
        }

        System.out.println("Array original:");

        for (int i = 0; i < 10; i++) {
            // Array original con sus índices.
        	System.out.println("pos[" + i + "] = " + numeros[i]); 
        }

        System.out.println("Array ordenado:");

        for (int i = 0; i < contadorPrimos; i++) {
            // Mostrar los números primos al inicio del array.
        	System.out.println("pos[" + i + "] = " + primos[i]); 
        }

        for (int i = 0; i < contadorNoPrimos; i++) {
            // Mostrar los números no primos en el orden en que se ingresaron.
        	System.out.println("pos[" + (i + contadorPrimos) + "] = " + noPrimos[i]); 
        }
    }

    // Función para verificar si un número es primo.
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            // Si el número es menor o igual a 1, no es primo.
        	return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Si el número es divisible por algún otro número, no es primo.
            	return false; 
            }
        }
        // Si no se cumple ninguna de las condiciones anteriores, el número es primo.
        return true; 
    }

}
