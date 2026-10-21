package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Paciente {
	
	private Long id;
	private String nombre;
	private String telefono;
	private LocalDate fechanacimiento;
	private String direccion;
	private String nif;
	private String email;
	
	private Historial historial;
	
	private ArrayList <Tratamiento> tratamientos= new ArrayList<Tratamiento>(); 
	
	public Paciente() {
		
	}

	public Paciente(Long id, String nombre, String telefono, LocalDate fechanacimiento, String direccion, String nif,
			String email) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.direccion = direccion;
		this.nif = nif;
		this.email = email;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

	// añadir tratamiento
	public void añadirTratamiento(Tratamiento Tratamiento) {
		tratamientos.add(Tratamiento);
	}
	
	
	public ArrayList<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fechanacimiento="
				+ fechanacimiento + ", direccion=" + direccion + ", nif=" + nif + ", email=" + email + "]";
	}
	
	

}
