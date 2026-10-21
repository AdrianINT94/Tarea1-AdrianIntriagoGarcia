package model;

import java.time.LocalDateTime;

public class Revision extends Cita{
	
	private String anotaciones;
	
	public Revision() {
		super();
	}

	public Revision(Long id, LocalDateTime fechaHora,String anotaciones) {
		super(id, fechaHora);
		this.anotaciones=anotaciones;
	}

	public String getAnotaciones() {
		return anotaciones;
	}

	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}

	@Override
	public String toString() {
		return "Revisiones [anotaciones=" + anotaciones + ", toString()=" + super.toString() + "]";
	}

	
	
	}
	


