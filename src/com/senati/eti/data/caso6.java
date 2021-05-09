package com.senati.eti.data;
import com.senati.eti.model.Alumno;
import java.util.Scanner;
import java.io.*;

public class caso6 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		FileWriter archivo =null;
		PrintWriter pw = null;
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
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
			Alumno objAlumno = new Alumno(nom, ape, gen,ed);
			pw.println("-----------");
			pw.println("Datos registrados");
			pw.println("-----------");
			pw.println("Nombre y apellidos.:" + objAlumno.NombreCompleto());
			pw.println("Geberi.............:"+objAlumno.MostrarGenero());
			System.out.println("El archivo fue creado correctamente");
			
			
		} catch (Exception e1){
			e1.printStackTrace();
			
		}finally {
			try {
				if (archivo != null) archivo.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
