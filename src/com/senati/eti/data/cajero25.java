package com.senati.eti.data;
import java.util.Scanner;

public class cajero25 {

	public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			
			String rp = "S", nombre = "";
			int nr = 0, edad = 0;

			
			while (rp.equals("S") || rp.equals("s")) {
				
				String[] arrcodigo = {"111", "222", "333", "444", "555", "666", "777", "888"};
		        String estado = "", rpt="";
		        String[] arrnombre = {"Joe Castillo", "Balmer Aldave", "Juan Gomez","Felipe Ramos",
		        		              "Pedro Lopez", "Felipe Torres", "Juan Lopez", "Luis Quinua"};
		        int [] arrnota= {1300, 800, 1800, 1000, 1500, 400, 1005, 756};
		        float din_a =0;
		        
		        String codigo ="";
		        System.out.println("\n----------------------------------");
		        System.out.println("-----------------BANCO--------------");
		        System.out.println("------------------------------------");
		        System.out.print("Ingrese tarjeta : ");
		        codigo = x.nextLine();
		        
		        //Realizar la busqueda del codigo en el arreglo arrcodigo
		        int posicion = -1;
		        for (int i=0; i< arrcodigo.length; i++) {
		        	
		        	if(arrcodigo [i].equals(codigo)) {
		        		posicion = i;
		        		
		        	
		               
		                
		                }
		        	
		               
}
		        
		        
		        
		       
		        
		       
			
	


		        
		        System.out.print("Ingrese cantidad a sacar : ");
		        float nota = x.nextFloat();
		        if (arrnota[posicion] ==  arrnota[posicion]) {
		        	estado = "Tiene saldo para sacar";
		        	din_a = arrnota[posicion]-nota;
		        	if (din_a<0 )
		        		estado="No tiene dinero para sacar";
		        	}
		        else 
		        	if (din_a<= nota )
		        		estado = "Saldo insuficiente"+"Saco "+arrnota[posicion];


		        System.out.println("\nResultados");
		        System.out.println("------------------------------------");
		        if (posicion == -1) {
		        	//codigo no se encontro
		        	System.out.println("\nCodigo no encontrado");
		        }   else {
		        	System.out.println("Datos del participante " );
		        	System.out.println("---------------------- " );
		        	System.out.println("Código...............: " + arrcodigo[posicion]);
		        	System.out.println("Nombre...............: " + arrnombre[posicion] );
		        	System.out.println("Dinero anterior......: " + arrnota[posicion] + " Soles");
		        	System.out.println("Dinero actual........: " + din_a + " Soles");
		        	System.out.println("Estado...............: " + estado );
		        	}
				
		        x.nextLine();
		        
				System.out.print("¿Continua? [S][N]");
				rp = x.nextLine();	
				
				if (rp.equals("N") || rp.equals("n")) {
					System.out.println("<< GRACIAS POR SU TIEMPO >> ");
					
				}
				
				

			}
			
			
			
		}
}

	
	
	
			
			
			
		
	
