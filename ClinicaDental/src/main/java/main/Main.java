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
		
		Sesion actual= new Sesion();
		actual.cerrarSesion();
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		do {
			
			System.out.println(".Menu principal");
			System.out.println("1.Iniciar Sesion");
			System.out.println("2.Cerrar sesion");
			System.out.println("3.Salir del programa");
			System.out.println("Elegir una opcion");
			
			opcion=leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
				case 1: 
					if(actual.isActivo()) {
						System.out.println("Ya hay una sesion iniciada.Cierra sesion para entrar");
						break;
					}
					
					System.out.println("Introducir username");
					String username = leer.nextLine();
					System.out.println("Introducir password");
					String password = leer.nextLine();
					
					Autenticacion autenticacion = new Autenticacion();
					Sesion nueva  = null;
					
					if(username.isBlank() || password.isBlank()) {
						System.out.println("No puedes dejar campos vacios");
						break;
					}
					if(autenticacion.comprobarAdmin(username, password)) {
						nueva = new Sesion(username,"Administrador",model.Perfil.admin,true);
					}else {
						nueva = autenticacion.sesionPersonal(username, password);
					}
					
					if(nueva != null) {
						actual = nueva;
						System.out.println("Bienvenido :" + actual.getNombre());
						System.out.println("Perfil :" + actual.getPerfil());
						MenuPerfil(actual,leer);
					}else {
						System.out.println("Usuario o contraseña incorrectos");
					}
					break;
				
					
				case 2:
					if(actual.isActivo()) {
						actual.cerrarSesion();
						System.out.println("Sesion cerrada");
					}else {
						System.out.println("No hay ninguna sesion inicada");
					}
					
					break;	
				case 3:
					System.out.println("Saliendo del programa..");
					break;
				
			}
			}while(opcion != 3) ;
				
			leer.close();
		
	}
	public static void MenuPerfil(Sesion actual,Scanner leer) {
			switch(actual.getPerfil()) {
				
			case admin:
				System.out.println("Menu administrador");
				System.out.println("1.Registrar empleado");
				System.out.println("2.Gestionar alergias");
				System.out.println("0.Volver al menu principal");
				
				int opcionAdmin = leer.nextInt();
				leer.nextLine();
				
				switch(opcionAdmin) {
					case 1 :
						System.out.println("Has seleccionado registrar empleado");
						Registrarempleado registro = new Registrarempleado();
						registro.registrar(leer);
						
						break;
					
					case 2 :
						System.out.println("Has seleccionado gestionar alergias");
						Gestionalergia gestion = new Gestionalergia();
						int opcionAlergia;
						
						
						do {
							System.out.println("Gestion Alergias");
							System.out.println("1.Ver alergia");
							System.out.println("2.Crear alergia");
							System.out.println("3.Editar alergia");
							System.out.println("0.Volver");
							System.out.println("Elige una opcion");
							
							opcionAlergia = leer.nextInt();
							leer.nextLine();
							
							switch(opcionAlergia) {
							case 1:
								gestion.leerAlergias();
								break;
							case 2:
								gestion.CrearAlergia();
								break;
							case 3:
								break;
							case 0:
								System.out.println("Volviendo al menu adminsitrador");
								break;
							default:
								System.out.println("Opcion no valida");
								break;
							}
						}while(opcionAlergia !=0);
						
						break;
					
					case 0 :
						System.out.println("Volviendo al menu principal");
						break;
						
					default:
						System.out.println("Opcion no valida");
						break;	
				}
				break;
				
			case secretariado:
				System.out.println("Menu secretariado");
				System.out.println("Opciones secretariado");
				break;
			
			case enfermeria:
				System.out.println("Menu enfermeria");
				System.out.println("Opciones de enfermeria");
				break;
				
			case invitado:
				System.out.println("No hay sesion iniciada");
				break;

			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
