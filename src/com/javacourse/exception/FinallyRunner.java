package com.javacourse.exception;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			
			int[] numbers = {1,2,3,4,5,6};
			int number  = numbers[14];
			
			System.out.println("Antes de cerrarr scanner Termino");
			
		}catch (Exception ex) {
			System.out.println("Dentro de la exception");
		}finally { //Siempre se ejecuta
			scanner.close(); //Objetos que son creados son cerrados
		}
		
		System.out.println("Despues de cerrarr scanner Termino");
	}

}
