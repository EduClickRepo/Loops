package com.educlick;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int contador = 1; contador < 1000; contador = contador + 1) {
//			System.out.println(contador);
//			contador = contador - 1;
//		}
		
//		for(int i = 1; i < 5; i = i + 1) {
//			for(int x = 1; x < 10; x = x + 1) {
//				System.out.println("el valor de x es: "+ x);
//				System.out.println("el valor de i es: "+ i);
//			}
//			System.out.println("por fuera i es: "+ i);
//		}
		
		for(int horas = 0; horas <2; horas++) {
			if(horas == 1) {
				break;
			}
			for(int minutos = 0; minutos <5; minutos++) {
				if(minutos == 3) {
					break;
				}else {
					if(minutos == 4) {
						continue;
					}
				}
				for(int segundos = 0; segundos <4; segundos++) {
					if(segundos % 2 == 0) {
						continue;
					}
					System.out.println("La hora es: " + horas + ":" + minutos + ":" + segundos);
				}
			}
		}
		
		//Ejercicio un temporizador
		
		
	}

}
