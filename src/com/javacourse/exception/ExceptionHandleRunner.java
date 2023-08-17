package com.javacourse.exception;

public class ExceptionHandleRunner {

	public static void main(String[] args) {
		//En este ejemplo pasa una exception
		methodOne(); //Todo el codigo despues de la excepcion no se ejecuta
		
	}

	private static void methodOne() {
		method2();
	}

	private static void method2() {
		String str = null;
		str.length();
	}

}
