package model;

public class Enfermeria extends Empleado{
	
	private char categoria;
	
	
	public Enfermeria() {
		super();
	}


	public Enfermeria(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
			String email,char categoria) {
		super(id, nombre, apellidos, telefono, nif, direccion, email);
		this.categoria=categoria;
	}


	public char getCategoria() {
		return categoria;
	}


	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Enfermeria ["+super.toString()+ "categoria=" + categoria + "]";
	}
	

	
	
}
