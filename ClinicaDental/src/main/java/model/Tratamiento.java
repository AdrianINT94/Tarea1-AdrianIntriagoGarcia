package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tratamiento {
	
	private Long id;
	private String nombre;
	private LocalDate fechainicio;
	private String informe;
	private boolean consentimiento = false;
	
	private ArrayList<Cita> listacitas= new ArrayList<Cita>();
	public Tratamiento() {
		
	}

	public Tratamiento(Long id, String nombre, LocalDate fechainicio, boolean consentimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.consentimiento = consentimiento;
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


	public LocalDate getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}


	public boolean isConsentimiento() {
		return consentimiento;
	}


	public void setConsentimiento(boolean consentimiento) {
		this.consentimiento = consentimiento;
	}
	//añadir cita
	public void añadircita(Cita cita) {
		this.listacitas.add(cita);
	}
	
	public ArrayList<Cita> getListacitas() {
		return listacitas;
	}
	
	
	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	@Override
	public String toString() {
		return "Tratamientos [id=" + id + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", consentimiento="
				+ consentimiento + "]";
	}
	
	
	
	
}
