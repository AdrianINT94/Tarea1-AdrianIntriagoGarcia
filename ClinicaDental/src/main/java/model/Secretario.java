package model;

public class Secretario extends Empleado{
	
	private int aniosExperiencia;
	
	public Secretario() {
		super();
	}

	public Secretario(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
			String email, int aniosExperiencia) {
		super(id, nombre, apellidos, telefono, nif, direccion, email);
		this.aniosExperiencia=aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	//metodos 
	public Paciente registrarPaciente(Paciente paciente) {
		return paciente;
	}
	public Cita registrarCita(Cita cita) {
		return cita;
	}

	@Override
	public String toString() {
		return "Secretario ["+super.toString() +"aniosExperiencia=" +aniosExperiencia+ "]";
	}

		
}
