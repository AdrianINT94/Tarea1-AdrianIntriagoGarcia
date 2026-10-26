package main;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import model.Alergia;
import model.Medicamento;


public class Gestionalergia {

	public void leerAlergias() {
		File carpeta = new File ("src/main/resources/Alergia/");
		File[] archivos = carpeta.listFiles();
		
		if(archivos == null) {
			System.out.println("No se encuentra la carpeta Alergia");
			return;
		}
		
		ArrayList<Alergia> listaAlergias = new ArrayList<Alergia>();
	
		for(File archivo :archivos) {
			try {
				FileInputStream fichero = new FileInputStream (archivo);
				ObjectInputStream entrada = new ObjectInputStream(fichero);
				
				Alergia alergia = (Alergia) entrada.readObject();
				listaAlergias.add(alergia);
				entrada.close();
				
			}catch(Exception e) {
				System.out.println("Erro al leer");
			}
		}
	//ordena la lista y las compara por ID
		Collections.sort(listaAlergias,new Comparator<Alergia>() {
		@Override
		public int compare(Alergia a1,Alergia a2) {
			return a1.getId().compareTo(a2.getId());
		}
});
		for(Alergia alergia :listaAlergias) {
			System.out.println(alergia);
		}
		
	}
	//creacion de la alergia  junto con el medicamento
		public void CrearAlergia() {
			
			File carpeta = new File("src/main/resources/Alergia");
			File[] archivos = carpeta.listFiles();
			long id =1;
			
			if(archivos !=null) {
				for(File archivo:archivos) {
					if(archivo.getName().endsWith(".dat")) {
						id++;
					}
				}
			}
			
			Scanner leer= new Scanner(System.in);
			
			System.out.println("Nombre de la alergia:");
			String nombreAlergia = leer.nextLine();
			
			System.out.println("Nombre de medicamento:");
			String nombremedicamento = leer.nextLine();
			
			System.out.println("Principio activo:");
			String principio = leer.nextLine();
			
			System.out.println("Dosis maxima:");
			int dosis ;
				//validaciones 
			try {
				dosis = Integer.parseInt(leer.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("la dosis debe ser un numero entero ");
				return;
			}
			
			if(nombreAlergia.isBlank() || nombremedicamento.isBlank()|| principio.isBlank() ||dosis<=0) {
				System.out.println("Los datos no son validos");
				return;
			}
			System.out.println("Quieres guardar esta alergia?(s/n)");
			String confirmar =leer.nextLine();
			
			if(!confirmar.equalsIgnoreCase("s")) {
				System.out.println("Creacion cancelada");
				return;
			}
			
			Medicamento medicamento = new Medicamento(id,nombremedicamento,principio,dosis);
			Alergia alergia = new Alergia(id,nombreAlergia,medicamento);
		
			try {
				File archivo = new File(carpeta,id + ".dat");
				FileOutputStream fichero = new FileOutputStream(archivo);
				ObjectOutputStream Salida = new ObjectOutputStream(fichero);
				
				Salida.writeObject(alergia);
				Salida.close();
				System.out.println("Alergia guardada correctamente");
				
			}catch(Exception e) {
				System.out.println("Error al guardar la alergia");
			}
		
		}
		
		public void editarAlergia() {
			Scanner leer= new Scanner (System.in);
			
			System.out.println("Introducir el id de la alergia para editar");
			long id =Long.parseLong(leer.nextLine());
			
			
			
			try {
				
				File carpeta = new File("src/main/resources/Alergia");
				File archivo = new File(carpeta,id + ".dat");
				
				
				FileInputStream fichero = new FileInputStream(archivo);
				ObjectInputStream entrada = new ObjectInputStream(fichero);
				
				Alergia alergia =(Alergia) entrada.readObject();
				entrada.close();
				
				System.out.println("Alergia actual");
				System.out.println(alergia);
				
				System.out.println("Nuevo nombre de la alergia");
				String nombre = leer.nextLine();
				
				System.out.println("Nuevo medicamento");
				String nombremedicamento = leer.nextLine();
				
				System.out.println("Nuevo principio activo");
				String principio = leer.nextLine();
				
				System.out.println("Nueva dosis");
				int dosis = leer.nextInt();
				//validaciones
				
				if(nombre.isBlank()  || nombremedicamento.isBlank() || principio.isBlank() || dosis <=0) {
					System.out.println("Los datos no son validos");
					return;
				}
				System.out.println("Quieres guardar los cambios(s/n)");
				String confirmar = leer.nextLine();
				
				if(!confirmar.equalsIgnoreCase("s")) {
					System.out.println("Edicion cancelada");
					return;
				}

				alergia.setNombre(nombremedicamento);
				Medicamento medicamento = alergia.getMedicamento();
				medicamento.setNombre(nombre);
				medicamento.setPrincipio(principio);
				medicamento.setDosis(dosis);
				
				FileOutputStream  ficheroSalida = new FileOutputStream(archivo);
				ObjectOutputStream salida = new ObjectOutputStream(ficheroSalida);
				salida.writeObject(alergia);
				
				salida.close();
				System.out.println("Alergia editada bien");
				
			}catch(Exception e) {
				System.out.println("Error al editar las alergias" + e.getMessage());
			}
		}
		
	}
