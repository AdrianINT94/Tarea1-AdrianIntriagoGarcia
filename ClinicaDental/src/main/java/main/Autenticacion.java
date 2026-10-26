package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import model.Perfil;
import model.Sesion;

public class Autenticacion {
	
	
	private Configuracion configuracion ;
	
	public Autenticacion() {
		configuracion = new Configuracion();
		
	}
	
	public boolean comprobarAdmin(String username,String password) {
		return username.equals(configuracion.getAdminUsername()) && password.equals(configuracion.getAdminPassword());
	}


	public Sesion sesionPersonal(String username,String password) {
		
		try(InputStream entrada = getClass().getClassLoader().getResourceAsStream("credenciales.txt")){
			
			if(entrada == null) {
				System.out.println("No se encuentra credenciales.txt");
				return null;
			}
			BufferedReader lector = new BufferedReader( new InputStreamReader(entrada,"UTF-8"));
			
			String linea;
			
			while((linea = lector.readLine()) !=null){
				String[] datos = linea.split("\\|");
				
				if(datos.length == 4 && datos[0].equals(username) && datos[1].equals(password)) {
					
				Perfil perfil = Perfil.valueOf(datos[3]);
				return new Sesion(datos[0],datos[2],perfil,true);
					
				}
			}
		}catch(IOException e) {
			System.out.println("Erro al leer las credenciales" + e.getMessage());
		}
		return null;
	}
}
