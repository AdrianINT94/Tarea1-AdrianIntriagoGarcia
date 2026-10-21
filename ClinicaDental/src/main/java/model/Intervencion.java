package model;

import java.time.LocalDateTime;

public class Intervencion extends Cita{
	
	
	private int duracion;

	public Intervencion() {
		super();
	}

	public Intervencion(Long id, LocalDateTime fechaHora,int duracion) {
		super(id, fechaHora);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Intervenciones [duracion=" + duracion + ", toString()=" + super.toString() + "]";
	}

	
	}

	
	

	
	

	


	
	
	

