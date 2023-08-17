package com.javacourse.exception;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		
		//Esta es una forma mas facil de manejar excepptions desde java 7
		try(Scanner scanner = new Scanner(System.in);){
			int[] numbers = {1,2,3,4,5,6};
			int number  = numbers[14];
		}
	}

}
