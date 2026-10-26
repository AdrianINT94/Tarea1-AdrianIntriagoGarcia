package model;

import java.time.LocalDateTime;

public class Cita {
	
	private Long id;
	private LocalDateTime fechaHora;
	private String anotacion;
	
	public Cita() {
	}

	public Cita(Long id, LocalDateTime fechaHora, String anotacion) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.anotacion = anotacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}

	@Override
	public String toString() {
	    return "Cita [id=" + id + ", fechaHora=" + fechaHora
	            + ", anotacion=" + anotacion + "]";

	
	}
	
}
