package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Inicializar variable diferenciadora y comparadora para el select case
		int diaInt = 0;
		
		//MIENTRAS la variable diaInt continúe en 0, se ejecutará el programa para ingresar datos
		while (diaInt == 0) {
			//Solicitar al usuario un dia de la semana (Lunes - Viernes)
			Scanner scanner = new Scanner(System.in);
			System.out.println("Por favor, ingrese un dia de la semana (Lunes - Viernes): ");
			String dia = scanner.nextLine();
			
			//Comparar String ingresado para dar valor a la variable diaInt
			switch (dia) {
			case "Lunes":
				diaInt = 1;
				break;
			case "Martes":
				diaInt = 2;
				break;
			case "Miercoles":
				diaInt = 3;
				break;
			case "Jueves":
				diaInt = 4;
				break;
			case "Viernes":
				diaInt = 5;
				break;
			default:
				System.out.println("ERROR, formato no valido");
				break;
		};

			//Si la variable cambia de valor gracias al select case, preguntar los siguientes datos
			if(diaInt > 0) {
				//Solicitar al usuario una hora (horas y minutos)
				System.out.println("Por favor, ingrese la hora: ");
				int hora = scanner.nextInt();
				System.out.println("Por favor, ingrese los minutos: ");
				int minuto = scanner.nextInt();
				
				//Llamar a la función para hacer las operaciones necesarias
				calcularMinutos(diaInt, hora, minuto);
				//Cerrar el scanner
				scanner.close();
			} //cierre if

		} //cierre while

	} //cierre main
		
		

	//Calcular cuántos minutos faltan para el fin de semana.
	//Considerando el inicio para el fin de semana Viernes a las 15:00 hrs
	//Funcion calcularMinutos que recopila los datos de dia, hora y minuto
	public static void calcularMinutos(int diaInt, int hora, int minuto) {
		
		//Establecer cual es el valor del maximo dia en que inicia el fin de semana, Viernes en 5
		int inicioDiasFin = 5;
		
		//Restar la cantidad asignada de dia a la cantidad que simboliza el fin de semana
		//Como resultado se asignarán los dias faltantes para el fin de semana
		int diasFaltantes = (inicioDiasFin - diaInt);
		
		//Convertir dias faltantes a minutos
		int diasAMinutos = diasFaltantes * 24 * 60;
		
		//Inicializar valor de la hora en que inicia el fin de semana
		int inicioHoraFin = 15;
		//Restar el valor de inicioHoraFin a la hora ingresada por el usuario para calcular horas restantes
		int horasRestantes = inicioHoraFin - hora;
		
		//Convertir las horas restantes a minutos tomando en cuenta que una hora dura 60 minutos y restando ese valor a los minutos ingresados
		int horasAMinutos = horasRestantes * (60 - minuto);	
		
		//Sumar las variables que almacenan los minutos
		int minutosFaltantes = diasAMinutos + horasAMinutos;
		//Imprimir resultado al usuario
		System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
		
		
	} //cierre calcularMinuto
	
} // cierre Ejercicio 7
