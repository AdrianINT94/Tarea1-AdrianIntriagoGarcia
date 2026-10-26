package model;

public class Enfermeria extends Empleado{
	
	private char categoria;
	
	
	public Enfermeria() {
		super();
	}


	public Enfermeria(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
			String email,char categoria) {
		super(id, nombre, apellidos, telefono, nif, direccion, email);
		setCategoria(categoria);
	}


	public char getCategoria() {
		return categoria;
	}


	public void setCategoria(char categoria) {
		if(categoria == 'A' || categoria =='B' ||categoria  =='C') {
		this.categoria = categoria;
	}else {
		System.out.println("Error: la categoria debe ser A ,B O C");
	}
	}
	
	//Elaborarinforme
	public void elaborarinforme(Tratamiento tratamiento) {
		String informe = "";
		
		for(Cita cita :tratamiento.getListacitas()) {
			informe += cita.getAnotacion() + "\n";
		}
		tratamiento.setInforme(informe);
	
	}

	@Override
	public String toString() {
		return "Enfermeria ["+super.toString()+ "categoria=" + categoria + "]";
	}
}
