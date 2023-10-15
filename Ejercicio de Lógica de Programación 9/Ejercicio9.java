package Ejercicio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		/*
		 * Crear un diccionario Español-Inglés, que contenga al menos 20 palabras con su respectiva traducción
		 * Utiliza un objeto HashMap para almacenar pares de palabras
		 * 
		 * Input
		 * Solicitar a usuario una palbra en español
		 * 
		 * Output
		 * Mostrar por consola la palabra en inglés
		 * En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo
		 * 
		 */
		
		// Instancia de un HashMap que aceptados valores String para almacenar un diccionario de 20 palabras en español con su traducción
		Map<String, String> diccionario = new HashMap<>();
		
		// Insertar cada key con su respectivo valor usando el método .put(key, value)
		diccionario.put("pato", "duck");
		diccionario.put("cerdo", "pig");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("conejo", "rabbit");
		diccionario.put("hormiga", "ant");
		diccionario.put("ajolote", "axolotl");
		diccionario.put("capibara", "capybara");
		diccionario.put("oso", "bear");
		diccionario.put("abeja", "bee");
		diccionario.put("gusano", "worm");
		diccionario.put("cocodrilo", "crocodile");
		diccionario.put("caballo", "horse");
		diccionario.put("tigre", "tiger");
		diccionario.put("mosca", "fly");
		diccionario.put("mariposa", "butterfly");
		diccionario.put("foca", "seal");
		diccionario.put("cebra", "zebra");
		diccionario.put("oveja", "sheep");
		diccionario.put("langosta", "lobster");
		
		// Instanciar un objeto scanner para la inserción de datos
		Scanner sc = new Scanner(System.in);
		
		// Inicializar una variable ciclo para preguntar al usuario mientras no se altere el ciclo a false
		boolean ciclo = true;
		
		//Inicio del ciclo while
		while(ciclo) {
			
			// Impresion de instrucciones en pantalla
			System.out.println("****************************************");
			System.out.println("Diccionario de animales español - inglés");
			System.out.println("Por favor, ingrese un animal en español:");
			
			// Almacenamiento de los datos ingresados en una variable animal
			String animal = sc.nextLine();
			
			// Si la palabra ingresada se contiene en una key de las palabras del diccionario, se devuelve el valor de dicha key (traducción de la palabra)
			if(diccionario.containsKey(animal)) {
				
				// Impresión de resultado con traducción
				System.out.println(animal + " en inglés se escribe " + diccionario.get(animal));
				ciclo = false; // fin del ciclo cuando se traduzca una palabra
			} else {
				
				// Si no se cumple la condición de búsqueda, imprimir que no se encontró la palabra
				System.out.println("Lo siento, la palabra " + animal + " no se encuentra en nuestro diccionario :(");
			} // cierre if Else
			
		} // cierre while
		sc.close(); // cierre del objeto scanner para ahorro de memoria
	} // cierre main
} // cierre clase
