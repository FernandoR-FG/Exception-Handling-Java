package com.javacourse.exception;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		//Este codigo necesariamente implementa una Exception
		//    public static native void sleep(long millis) throws InterruptedException;
		
		//Vamos a intentar contenerla 
		/*
		try {
			otherMethod();			
		}catch(InterruptedException e){
			System.out.println("o");
		}*/
		//otherMethod(); No acepta porque no es la excepcion que se necesita
		otherMethod2(); //Eso si acepta porque la exception es runtime
	}
	
	//Como podemos ver aqui directamente arroja throws una exception
	private static void otherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	//Un metodo riesgoso que tiene un exception de Runtime
	private static void otherMethod2() throws RuntimeException {
	}
	
	//Jerarquia de exceptions
	
	/**/
	
	/*Tomar en cuenta que el order de los trycatch debe coincidir con 
	 * la jerarquia de las exception 
	 * 
	 * class Error extends Throwable() //Errores con los que no se puede hacer anda
	 * class Exception extends Throwable() //Programadores pueden manejarlas
	 * class InterruptedException extends Exception{} 
	 * class NullPointerException{}
	 * 
	 * Las exceptions que extends Exception pero no son Runtime Son llamadas checked
	 *Las runtime no son necesarios de contener porque son errores basicos como fuera de los limites del arreglo
	 * */
	
	/* Mejores practicas
	 * No ocultar exceptions
	 * No usarlo para control de flujo como if else
	 * Piensa en el usuario
	 * Piensa en el equipo
	 * Piensa en la llamada al metodo 
	 * Tener un control global, ninguna expecion va al main*/
}
