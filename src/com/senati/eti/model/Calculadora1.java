package com.senati.eti.model;

public class Calculadora1 {
	//atributos
	private float numero1;
	private float numero2;
	//definir metodos Getters y Setters
	//Asignar un valor(Set)
	//variable = valor;
	// obteniendo el valor(Get)
	//impirmir variable
	
	// Get: obtener el valor del atributo
	//Set: definir el valor paran el atributo
	
	public float getNumero1() {
		return this.numero1;
	}
	public void setNumero1(float num1) {
		this.numero1= num1;
	}
	 
	public float getNumero2() {
		return this.numero2;
	}
	public void setNumero2(float num2) {
		this.numero2 = num2;
	}
	
	//definir los constructores
	//Contructor: permite iniciar los valores para los atributos de la clase
	//sobrecarga: se crea dos constructores pero con diferentes sintaxis
	
	public Calculadora1() {
		
	}
	
	//constructor con parametros de entrada
	public Calculadora1(float n1, float n2) {
		this.numero1 = n1;
		this.numero2= n2;
	}
	
	//metodos personalizados
	public float Suma() {
		return this.numero1 + this.numero2;
	}
	public float Resta() {
		return this.numero1 - this.numero2;
	}
	public float Multiplicacion() {
		return this.numero1 * this.numero2;
	}
	
	public float Division() {
		float r =0;
		if (this.numero2 !=0)
		r= this.numero1 / this.numero2;
		return r;

	}
	
	
	public float Restoentero() {
		float r =0;
		if (this.numero2 !=0)
		r= this.numero1 % this.numero2;
		return r;
		
	}
	

}
