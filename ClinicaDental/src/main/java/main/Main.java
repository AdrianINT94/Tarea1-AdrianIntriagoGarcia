package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import model.Alergia;
import model.Cita;
import model.Historial;
import model.Intervencion;
import model.Medicamento;
import model.Paciente;
import model.Revision;
import model.Sesion;
import model.Tratamiento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sesion actual= null;
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		do {
			
			System.out.println(".Menu principal");
			System.out.println("1.IniciarSesion");
			System.out.println("2.Salir del programa");
			System.out.println("Elegir una opcion");
			
			opcion=leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
				case 1: 
					System.out.println("Introducir username");
					String username = leer.nextLine();
					System.out.println("Introducir password");
					String password = leer.nextLine();
					System.out.println("El usuario introducido es " +username);
				break;	
			
				case 2:
				System.out.println("Saliendo del programa..");
				break;	
				default:
				System.out.println("Opcion no valida");
				break;
				
			}
			}while(opcion != 2) ;
				
			leer.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Paciente Adrian= new Paciente(14L,"Adrian","684632911",LocalDate.of(1994,05,27),"CalleSanNicolas","53784545B","intri15@educastur.es");
	
		Citas c1 = new Citas(1L,LocalDateTime.of(2026,10,14,10,30));
		Revisiones r1= new Revisiones(2L,LocalDateTime.of(2026,10,20,11,0),"Revisar empastes");
		//t.añadircita(r1);
		Intervenciones il= new Intervenciones(3L,LocalDateTime.of(2026,10,25,12,0),45);
		
		
		
		Tratamientos t= new Tratamientos(1L,"Empaste",LocalDate.of(2026, 10, 13),true);
		t.añadircita(il);
		t.añadircita(c1);
		t.añadircita(r1);
		Adrian.añadirTratamiento(t);
		
		
		
		
		Historial h = new Historial(1L,1001L,"Historial medico Adrian");
		Adrian.setHistorial(h);//historial
		
		Medicamento m = new Medicamento(1L,"Ibuprofeno","Ibuprofeno",1200);
		
		Alergias a = new Alergias(1L,"Alergia al ibuprofeno",m);
		System.out.println(a);//alergia
		//h.añadirAlergia(a);//añadir alergia
		Adrian.getHistorial().añadirAlergia(a);
		
		
		
		
		System.out.println(Adrian);
		System.out.println(t.getListacitas());
		System.out.println(Adrian.getTratamientos());
		System.out.println(Adrian.getHistorial());
		System.out.println(m); //medicamento
		System.out.println(a.getMedicamento());
		System.out.println(h.getListalergias());
		*/
		}

		}
