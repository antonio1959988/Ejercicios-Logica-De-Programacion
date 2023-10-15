package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
	    // Crear un objeto Scanner para la entrada estándar
	    Scanner scanner = new Scanner(System.in);

	    // Solicitar al usuario que ingrese una palabra o frase
	    System.out.print("Ingresa una palabra o frase: ");
	    
	    // Leer la entrada del usuario y almacenarla en la variable "texto"
	    String texto = scanner.nextLine();

	    // Cerrar el objeto Scanner para liberar recursos
	    scanner.close();

	    // Llamar a la función "invertirTexto" para invertir la cadena ingresada
	    String textoInvertido = invertirTexto(texto);

	    // Mostrar el texto invertido en la consola
	    System.out.println("Texto invertido: " + textoInvertido);
	}

	// Función para invertir un texto
	public static String invertirTexto(String texto) {
	    // Crear un objeto StringBuilder para construir la cadena invertida
	    StringBuilder resultado = new StringBuilder();

	    // Recorrer la cadena original en orden inverso
	    for (int i = texto.length() - 1; i >= 0; i--) {
	        // Agregar cada carácter al objeto StringBuilder
	        resultado.append(texto.charAt(i));
	    }

	    // Convertir el objeto StringBuilder en una cadena y devolverla
	    return resultado.toString();
	}


}
