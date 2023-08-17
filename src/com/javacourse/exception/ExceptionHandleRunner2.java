package com.javacourse.exception;

public class ExceptionHandleRunner2 {

	public static void main(String[] args) {
		//En este ejemplo pasa una exception
		methodOne(); //Todo el codigo despues de la excepcion no se ejecuta
		System.out.println("Main Termino");
	}

	private static void methodOne() {
		method2();
		System.out.println("MethodOne Termino");
	}

	private static void method2() {
		try { //Si no le sale pasara al catch
			String str = null;
			str.length();	
			//Podemos tener varios bloques catch para manejar diferentes excepciones
		}catch(NullPointerException ex){
			System.out.println("Aqui tenemos le exception null pointer");
		}
		catch(Exception e) { //Esto es lo que hace la exection
			e.printStackTrace(); 
		}
	}

}
