package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Intervencion extends Cita{
	
	
	private Enfermeria enfermeria;
	private int duracion;
	private String materialutilizado;
	private String desarrollo;
	private String pruebasRealizadas;
	
	private ArrayList<Cirujano>listacirujanos = new ArrayList<Cirujano>(); 

	public Intervencion() {
		super();
	}

	public Intervencion (Long id,LocalDateTime fechaHora,int duracion,String anotacion,
			Enfermeria enfermeria,String materialutilizado,
			String desarrollo,String pruebasRealizadas) {
		
		super(id,fechaHora,anotacion);
		this.duracion = duracion;
		this.enfermeria = enfermeria;
		this.materialutilizado = materialutilizado;
		this.desarrollo = desarrollo;
		this.pruebasRealizadas = pruebasRealizadas;
	}

	public Enfermeria getEnfermeria() {
		return enfermeria;
	}

	public void setEnfermeria(Enfermeria enfermeria) {
		this.enfermeria = enfermeria;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getMaterialutilizado() {
		return materialutilizado;
	}

	public void setMaterialutilizado(String materialutilizado) {
		this.materialutilizado = materialutilizado;
	}

	public String getDesarrollo() {
		return desarrollo;
	}

	public void setDesarrollo(String desarrollo) {
		this.desarrollo = desarrollo;
	}

	public String getPruebasRealizadas() {
		return pruebasRealizadas;
	}

	public void setPruebasRealizadas(String pruebasRealizadas) {
		this.pruebasRealizadas = pruebasRealizadas;
	}

		// Cirujanos 
	public ArrayList<Cirujano> getListacirujanos() {
		return listacirujanos;
	}
	
	public boolean añadirCirujano(Cirujano cirujano) {
		if(cirujano == null) {
			System.out.println("El cirujano no puede ser nulo");
			return false;
		}
		if(listacirujanos.size() >=2) {
			System.out.println("intervencion admite como maximo dos cirujanos");
			return false;
		}
		if(listacirujanos.contains(cirujano)) {
			System.out.println("Este cirujano ya esta añadido");
			return false;
		}
	
	listacirujanos.add(cirujano);
	return true;
	}
	
	@Override
	public String toString() {
		return "Intervencion [enfermeria=" + enfermeria + ", duracion=" + duracion + ", materialutilizado="
				+ materialutilizado + ", desarrollo=" + desarrollo + ", pruebasRealizadas=" + pruebasRealizadas
				+ ", listacirujanos=" + listacirujanos + "]";
	}
}

	
	
	

	
	

	


	
	
	

