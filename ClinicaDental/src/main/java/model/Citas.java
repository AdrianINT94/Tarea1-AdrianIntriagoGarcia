package model;

import java.time.LocalDateTime;

public class Citas {
	
	private Long id;
	private LocalDateTime fechaHora;
	
	public Citas() {
	}

	public Citas(Long id, LocalDateTime fechaHora) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
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

	@Override
	public String toString() {
		return "Citas [id=" + id + ", fechaHora=" + fechaHora + "]";
	}
	
	
}
