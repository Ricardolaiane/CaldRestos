package br.calcula.modelo;

public class Calculos {
	
	private double numero1;
	private double numero2;


	
	public double getNumero1() {
		return numero1;
	}



	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}



	public double getNumero2() {
		return numero2;
	}



	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}



	public double calcularResto(double n1, double n2) {
		// double resultado = n1/n2;
	     double  resto = n1%n2; 
	     System.out.println("valor do calculo" + resto);
	     return resto;
	     
	     
	}
	

}
