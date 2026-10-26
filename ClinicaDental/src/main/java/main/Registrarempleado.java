package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cirujano;
import model.Especialidad;

public class Registrarempleado {

		public void registrar(Scanner leer) {
	
		System.out.println("Nombre:");
		String nombre = leer.nextLine();
		
		System.out.println("Apellidos:");
		String apellidos = leer.nextLine();
		
		System.out.println("NIF:");
		String nif = leer.nextLine();
		
		System.out.println("Telefono");
		String telefono = leer.nextLine();
		
		System.out.println("Direccion:");
		String direccion = leer.nextLine();
		
		System.out.println("Email:");
		String email = leer.nextLine();
		
		System.out.println("Nombre de usuario:");
		String username = leer.nextLine();
		
		System.out.println("Contraseña:");
		String password = leer.nextLine();
		
		System.out.println("Perfil (secretariado/enfermeria/cirujano):");
		String perfil = leer.nextLine();
		
		//validaciones usuario y contraseña
		if(username.isBlank() || password.isBlank()) {
			System.out.println("Error: insertar usuario y contraseña");
			return;
		}
		if(username.contains(" ") || password.contains(" ")) {
			System.out.println("Error: sin espacios ");
			return;
		}
		if(!perfil.equals("secretariado") && !perfil.equals("enfermeria") && !perfil.equals("cirujano")) {
			System.out.println("Error: perfil no valido");
			return;
		}
		
		switch(perfil) { //Perfiles y sus datos 
		case "secretariado":
			System.out.println("Años de experiencia");
				
			int Experiencia ;
			
			try {
				Experiencia =Integer.parseInt(leer.nextLine());
				if(Experiencia <0) {
					System.out.println("Error los años no pueden ser negativos");
					return;
				}
				
				}catch(NumberFormatException e) {
					System.out.println("Error debe ser un numero");
					return;
				}
			
			break;
			
		case "enfermeria":
			System.out.println("Categoria (A, B o C):");
			String Categoria = leer.nextLine();
			
			if(Categoria.length() != 1) {
				System.out.println("Error ");
				return;
			}
			char categoria = Categoria.toUpperCase().charAt(0);
			
			if(categoria !='A' &&categoria !='B' && categoria != 'C') {
				System.out.println("Error");
				return;
			}
			break;
		
		case "cirujano":
			System.out.println("Especialidades..");
			System.out.println("1. Odontologia");
			System.out.println("2. Fisioterapia");
		    System.out.println("3. Ginecologia");
		    System.out.println("4. Cirugia plastica");
		    System.out.println("5. Digestivo");
		    System.out.println("6. Cirugia pediatrica");
		    System.out.println("7. Radiologia");
		    System.out.println("8. Geriatria");
		    
		    Cirujano cirujano = new Cirujano(null,nombre,apellidos,telefono,nif,direccion,email,new ArrayList<Especialidad>());
			String especialidades = leer.nextLine();
			break;
		}
		
		File archivo = new File("src/main/resources/credenciales.txt");
	
		
		try {
			List<String> lineas = Files.readAllLines(archivo.toPath());
			
			//Comprobaciion
			for(String linea: lineas) {
				String[] datos = linea.split("\\|");
				
				if(datos.length ==4 && datos[0].equals(username)) {
					System.out.println("Error:el usuario ya existe");
					return;
				}
			}
			//confirmacion de registro
			System.out.println("Confirmacion de registro (s/n)");
			String confirmar=leer.nextLine();
			
			if(!confirmar.equalsIgnoreCase("s")) {
				System.out.println("Registro cancelado");
				return;
			}
			//datos nuevos que se guardan  
			String nuevalinea = username +"|"+ password +"|"+ nombre+" "+apellidos +"|"+perfil;
			Files.writeString(archivo.toPath(), System.lineSeparator(),StandardOpenOption.APPEND);
			Files.writeString(archivo.toPath(), nuevalinea + System.lineSeparator(),StandardOpenOption.APPEND);
			System.out.println("Empleado registrado correctamente");
		}catch(IOException e) {
			System.out.println("Error al aceder al fichero" + e.getMessage());
		}
		
		
}
}
