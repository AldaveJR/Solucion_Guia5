package com.senati.eti.data;
import java.util.Scanner;

import com.senati.eti.model.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		// Instancia : crear un objeto a partir de una clase
		Calculadora1 objCalc = new Calculadora1();
		float n1 =0, n2 =0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		System.out.print("Número 1: ");
		n1 = x.nextFloat();
		System.out.print("Número 2: ");
		n2 = x.nextFloat();
		
		objCalc.setNumero1(n1);
		objCalc.setNumero2(n2);
	
		System.out.println("\n R E S U L T A D O S");
		System.out.println("------------------");
		System.out.println("1. Suma............:" + objCalc.Suma());
		System.out.println("2. Resta...........:" + objCalc.Resta());
		System.out.println("3. Multiplicacion..:" + objCalc.Multiplicacion());
		
		if (objCalc.getNumero2() !=0) {
			System.out.println("4. Division........:" + objCalc.Division());
			System.out.println("5. Resto entero....:" + objCalc.Restoentero());
		
		}else {
			System.out.println("4. Division........:" + "No es posible");
			System.out.println("5. Resto entero....:" +"No es posible" );
		}
	}

}
