package com.senati.eti.data;
import com.senati.eti.model.Calculadora2;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
        float n1 =0, n2 =0;
        float num_mayor=0;
        float num_menor=0;
        float np=0;
        
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		System.out.print("Número 1: ");
		n1 = x.nextFloat();
		System.out.print("Número 2: ");
		n2 = x.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2(n1 , n2);
		if (n1 > n2) {
			num_mayor =n1;
			num_menor=n2;
		}
		else {
			if(n1<n2)
				num_menor=n1;
		        num_mayor=n2;
		}
		
			
	
			
		System.out.println("\n R E S U L T A D O S");
		System.out.println("------------------");
		System.out.println("1. Suma............:" + objCalc.Calcular(1));
		System.out.println("2. Resta...........:" + objCalc.Calcular(2));
		System.out.println("3. Multiplicacion..:" + objCalc.Calcular(3));
		
		
		if (objCalc.getNumero2() !=0) {
			System.out.println("4. Division........:" + objCalc.Calcular(4));
			System.out.println("5. Resto entero....:" + objCalc.Calcular(5));
			System.out.println("6. Promedio..:" + objCalc.Calcular(6));
			System.out.println("7. Suma de cuadros..:" + objCalc.Calcular(7));
			System.out.println("8. Diferencia porcentual..:" + objCalc.Calcular(8));
			System.out.println("9. numero mayor..:" + objCalc.Calcular(9));
			System.out.println("10. numero menor..:" + num_menor);
		
		}else {
			System.out.println("4. Division........:" + "No es posible");
			System.out.println("5. Resto entero....:" +"No es posible" );
			System.out.println("6. Promedio..:" + objCalc.Calcular(6));
			System.out.println("7. Suma de cuadros..:" + objCalc.Calcular(7));
			System.out.println("8. Diferencia porcentual..:" + objCalc.Calcular(8));
			System.out.println("9. numero mayor..:" + num_mayor);
			System.out.println("10. numero menor..:" + num_menor);
		

	}

	}
}
