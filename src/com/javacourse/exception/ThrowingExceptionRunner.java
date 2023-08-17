package com.javacourse.exception;

class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	//En este metodo se  aumenta la excepcion y entonces
	//Ya no es necesario poner Runtime solo Exception
	public void add(Amount other) throws Exception {
		if(!this.currency.equals(other.currency)) {
			//throw new RuntimeException("Currency not match");
			//throw new Exception("Currency not match " + this.currency);
			
			//mandando la exception propia
			throw new CurrenciesDoNotMatchException("Currency not match " + this.currency + "&" + other.currency);
		}
		this.amount += other.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

//Crenado un exception propia
class CurrenciesDoNotMatchException extends Exception{
	 public CurrenciesDoNotMatchException(String msg) {
		 super(msg);
		 
	 }
}


public class ThrowingExceptionRunner {
											//Aqui tambien es necesario añadir la exception
	public static void main(String[] args) throws Exception {
		Amount amount1 =new Amount("USD",500);
		Amount amount2 =new Amount("EUR",500);
		Amount amount3 =new Amount("REAL",500);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
