package com.educlick;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int contador = 1; contador < 1000; contador = contador + 1) {
//			System.out.println(contador);
//			contador = contador - 1;
//		}
		
		for(int i = 1; i < 5; i = i + 1) {
			for(int x = 1; x < 10; x = x + 1) {
				System.out.println("el valor de x es: "+ x);
				System.out.println("el valor de i es: "+ i);
			}
			System.out.println("por fuera i es: "+ i);
		}
		
	}

}
