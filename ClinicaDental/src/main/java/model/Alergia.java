package model;

import java.io.Serializable;

public class Alergia implements Serializable{
	
	private Long id;
	private String nombre;
	
	private Medicamento medicamento;
	public Alergia() {
		
	}
	public Alergia(Long id, String nombre,Medicamento medicamento) {
		this.id = id;
		this.nombre = nombre;
		this.medicamento = medicamento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Medicamento getMedicamento() {
		return medicamento;
	}
	
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	@Override
	public String toString() {
		return "Alergias [id=" + id + ", nombre=" + nombre + ", medicamento=" + medicamento + "]";
	}

		
}
