package model;

import java.time.LocalDateTime;

public class Revision extends Cita{
	
	
	
	public Revision() {
		super();
	}

	public Revision(Long id, LocalDateTime fechaHora,String anotacion) {
		super(id, fechaHora,anotacion);
		
	}

	@Override
	public String toString() {
		return "Revisiones ["  + super.toString() + "]";
	}

	
	
	}
	


