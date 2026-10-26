package model;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Enfermeria extends Empleado{
	
	private char categoria;
	
	
	public Enfermeria() {
		super();
	}


	public Enfermeria(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
			String email,char categoria) {
		super(id, nombre, apellidos, telefono, nif, direccion, email);
		setCategoria(categoria);
	}


	public char getCategoria() {
		return categoria;
	}


	public void setCategoria(char categoria) {
		if(categoria == 'A' || categoria =='B' ||categoria  =='C') {
		this.categoria = categoria;
	}else {
		System.out.println("Error: la categoria debe ser A ,B O C");
	}
	}
	
	//Elaborarinforme
	public void elaborarinforme(Tratamiento tratamiento) {
		String informe = "";
		
		for(Cita cita :tratamiento.getListacitas()) {
			informe += cita.getAnotacion() + "\n";
		}
		tratamiento.setInforme(informe);
	
	}
	
	public void registrarIntervencion(Scanner leer ,Tratamiento tratamiento) {
			
		System.out.println("ID de la intervencion");
		Long id =Long.parseLong(leer.nextLine());
		
		System.out.println("Fecha y hora");
		LocalDateTime fechahora =LocalDateTime.parse(leer.nextLine());
		
		System.out.println("Duracion en minutos");
		int duracion = Integer.parseInt(leer.nextLine());
		
		System.out.println("Material utilizado");
		String material = leer.nextLine();
		
		System.out.println("Desarrollo de la intervencion");
		String desarrollo = leer.nextLine();
		
		System.out.println("Anotacion");
		String anotacion = leer.nextLine();
		
		System.out.println("Pruebas realizadas");
		String pruebas = leer.nextLine();
			
		
		Intervencion intervencion = new Intervencion(id,fechahora,duracion,anotacion,this,material,desarrollo,pruebas);
		tratamiento.añadircita(intervencion);
	}

	@Override
	public String toString() {
		return "Enfermeria ["+super.toString()+ "categoria=" + categoria + "]";
	}
}
