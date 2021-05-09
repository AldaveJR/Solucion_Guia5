package com.senati.eti.data;
import com.senati.eti.model.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Caso3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		// forma1
		Alumno objAl1 = new Alumno();
		objAl1.setNombre("Balmer");
		objAl1.setApellido("Aldave");
		objAl1.setGenero("M");
		objAl1.setEdad(24);
		
		//forma 2 
		Alumno objAl2 = new Alumno ( "Rosa", "Flores", "F",17);
		//forma3
		Alumno objAl3 = null;
		String nom = "", ape="", gen = "";
		int ed=0;
		System.out.println("REGISTRO DE DATOS");
		System.out.println("-----------------");
		System.out.print("Nombre.........:");
		nom= x.nextLine();
		System.out.print("Apellido.......:");
		ape= x.nextLine();
		System.out.print("Genero [F|M]...:");
		gen = x.nextLine();
		System.out.print("Edad [14-60]...:");
		ed = x.nextInt();
		objAl3 = new Alumno ( nom,ape,gen,ed);
		//Tipado a una clase
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		arrAlumno.add(objAl1);
		arrAlumno.add(objAl2);
		arrAlumno.add(objAl3);
		System.out.println("\n Datos registrados ");
		System.out.println("===================");
		
		String patron = "%-4s %-20s %-10s %-15s";
		System.out.println(String.format(patron,"N",
				"Nombres y Apellidos", "Genero", "Estado"));
		System.out.println(String.format(patron, "--",
				"-------------------", "------", "------"));
		for ( int y =0; y <arrAlumno.size(); y++) {
			System.out.println(String.format(patron,( y+1),
					arrAlumno.get(y).NombreCompleto(),
					arrAlumno.get(y).MostrarGenero(),
					arrAlumno.get(y).MostrarEstado()));
		}
		

	}

}
