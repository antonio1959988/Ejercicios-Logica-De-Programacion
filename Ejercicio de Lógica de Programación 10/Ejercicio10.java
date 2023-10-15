package Ejercicio10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
		 * Utilizar un objeto HashMap para almacenar los pares de palabras
		 * Escoger al azar 5 palabars en español del mini diccionario
		 * 
		 * Input
		 * Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
		 * Comprobar si el input es correcto
		 * 
		 * Output
		 * Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
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
		
		// Inicializar variables que contarán las respuestas correctas o incorrectas del examen
		int contadorAciertos = 0;
		int contadorErrores = 0;
		
		// Inicio del programa que hace 5 preguntas de palabras aleatorias del diccionario
		System.out.println("Examen de traduccón de palabras");
		for (int i = 1; i <= 5; i++) {
			
	        // Obtener una colección de los key (palabras en español) de diccionario
	        Collection<String> valores = diccionario.keySet();

	        // Generar un índice aleatorio para obtener key aleatoria
	        Random random = new Random();
	        int indiceAleatorio = random.nextInt(valores.size());
	        
	        // Acceder al valor del índice aleatorio y convertirlo a string
	        String valorAleatorio = (String) valores.toArray()[indiceAleatorio];

	        // Contador de pregunta + texto de apoyo + key aleatoria
	        System.out.println(i + ".- Por favor, ingrese la traducción de: " + valorAleatorio);
	        String respuesta = sc.nextLine(); // La respuesta se almacena en este punto
	        
	        // Si la respuesta ingresada es estrictamente igual al value en el HashMap diccionario, la respuesta es correcta y se incrementa el contador de respuestas correctas
	        if(respuesta.equals(diccionario.get(valorAleatorio))) {
	        	System.out.println("¡Correcto!");
	        	contadorAciertos++;
	        } else {
	        	
	        	// Si la respuesta no es correcta, incrementar el contador de errores
	        	System.out.println("Incorrecto :(...");
	        	contadorErrores++;
	        }
		}
		
		// Cerrar scamner para finalizar su uso
		sc.close();
		
		// Impresión de resultados del examen mostrando el valor de cada contador
		System.out.println("***********************************");
		System.out.println("FIN DEL EXAMEN");
		System.out.println("Obtubiste un total de:");
		System.out.println("*" + contadorAciertos + " respuestas correctas.");
		System.out.println("*" + contadorErrores + " respuestas incorrectas.");
	}

}
