package model;

import java.time.LocalDateTime;

public class Revisiones extends Citas{
	
	private String anotaciones;
	
	public Revisiones() {
		super();
	}

	public Revisiones(Long id, LocalDateTime fechaHora,String anotaciones) {
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
	


