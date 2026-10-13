package model;

import java.util.ArrayList;

public class Historial {
	
	private Long id;
	private Long numerohistorial;
	private String descripcion;
	
	private ArrayList<Alergias>listalergias= new ArrayList<Alergias>();
	
	public Historial() {
	}

	public Historial(Long id, Long numerohistorial, String descripcion) {
		super();
		this.id = id;
		this.numerohistorial = numerohistorial;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumerohistorial() {
		return numerohistorial;
	}

	public void setNumerohistorial(Long numerohistorial) {
		this.numerohistorial = numerohistorial;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void añadirAlergia(Alergias alergia) {
		this.listalergias.add(alergia);
	}
	
	public ArrayList<Alergias> getListalergias() {
		return listalergias;
	}

	@Override
	public String toString() {
		return "Historial [id=" + id + ", numerohistorial=" + numerohistorial + ", descripcion=" + descripcion + "]";
	}
	
	
}
