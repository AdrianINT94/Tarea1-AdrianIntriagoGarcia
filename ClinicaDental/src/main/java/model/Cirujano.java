package model;


import java.util.ArrayList;
public class Cirujano extends Empleado{
	
	private ArrayList<Especialidad> especialidades;
	
	public Cirujano() {
		this.especialidades=new ArrayList<Especialidad>();
		
		
	}

	public Cirujano(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
			String email,ArrayList<Especialidad>especialidades) {
		super(id, nombre, apellidos, telefono, nif, direccion, email);
		this.especialidades=especialidades;
	}

	public ArrayList<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

	 @Override
	    public String toString() {
	        return "Cirujano [" + super.toString()
	                + ", especialidades=" + especialidades + "]";
	
	
	
	
	 }
}


