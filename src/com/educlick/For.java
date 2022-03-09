package com.educlick;

public class For {

	public static void main(String[] args) {
		//EJEMPLO 1: CONTADOR
//		for(int contador = 1; contador < 1000; contador = contador + 1) {
//			System.out.println(contador);
//			contador = contador - 1;
//		}
		
		//EJERCICIO: FOR ANIDADO
//		for(int i = 1; i < 5; i = i + 1) {
//			for(int x = 1; x < 10; x = x + 1) {
//				System.out.println("el valor de x es: "+ x);
//				System.out.println("el valor de i es: "+ i);
//			}
//			System.out.println("por fuera i es: "+ i);
//		}
		
		//EXPLICACIÓN FOR ANIDADO
		for(int horas = 0; horas <24; horas++) {
			for(int minutos = 0; minutos <60; minutos++) {
				for(int segundos = 0; segundos <60; segundos++) {
					System.out.println("La hora es: " + horas + ":" + minutos + ":" + segundos);
				}
			}
		}
		
		//Ejercicio un temporizador
		for(int horas = 0; horas <24; horas--) {
			for(int minutos = 0; minutos <60; minutos--) {
				for(int segundos = 0; segundos <60; segundos--) {
					System.out.println("La hora es: " + horas + ":" + minutos + ":" + segundos);
				}
			}
		}
		
	}

}
