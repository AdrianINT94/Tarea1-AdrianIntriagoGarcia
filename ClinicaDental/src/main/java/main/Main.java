package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import model.Alergias;
import model.Citas;
import model.Historial;
import model.Intervenciones;
import model.Medicamento;
import model.Paciente;
import model.Revisiones;
import model.Tratamientos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente Adrian= new Paciente(14L,"Adrian","684632911",LocalDate.of(1994,05,27),"CalleSanNicolas","53784545B","intri15@educastur.es");
	
		Citas c1 = new Citas(1L,LocalDateTime.of(2026,10,14,10,30));
		
		Tratamientos t= new Tratamientos(1L,"Empaste",LocalDate.of(2026, 10, 13),true);
		t.añadircita(c1);
		
		
		Historial h = new Historial(1L,1001L,"Historial medico Adrian");
		Adrian.setHistorial(h);//historial
		
		Medicamento m = new Medicamento(1L,"Ibuprofeno","Ibuprofeno",1200);
		
		Alergias a = new Alergias(1L,"Alergia al ibuprofeno",m);
		System.out.println(a);//alergia
		h.añadirAlergia(a);//añadir alergia
		
		Revisiones r1= new Revisiones(2L,LocalDateTime.of(2026,10,20,11,0),"Revisar empastes");
		t.añadircita(r1);
		
		Intervenciones il= new Intervenciones(3L,LocalDateTime.of(2026,10,25,12,0),45);
		t.añadircita(il);
		
		Adrian.añadirTratamiento(t);
		
		System.out.println(Adrian);
		System.out.println(t.getListacitas());
		System.out.println(Adrian.getTratamientos());
		System.out.println(Adrian.getHistorial());
		System.out.println(m); //medicamento
		System.out.println(a.getMedicamento());
		System.out.println(h.getListalergias());
	}

}
