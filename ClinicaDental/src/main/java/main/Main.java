package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
		Scanner leer = new Scanner(System.in);
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		int opcion;
		do {
			
			System.out.println(".Menu principal");
			System.out.println("1.Sesion invitado");
			System.out.println("2.Iniciar Sesion");
			System.out.println("3.Cerrar sesion");
			System.out.println("4.Salir del programa");
			System.out.println("Elegir una opcion");
			
			opcion=leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			
				case 1:
				if(actual.isActivo()) {
					System.out.println("Cierra la sesion actual");
					break;
				}
				System.out.println("Bienvenido como invitado");
				MenuInvitado(leer);
				break;
			
			
				case 2: 
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
						MenuPerfil(actual,leer,pacientes);
					}else {
						System.out.println("Usuario o contraseña incorrectos");
					}
					break;
				
					
				case 3:
					if(actual.isActivo()) {
						actual.cerrarSesion();
						System.out.println("Sesion cerrada");
					}else {
						System.out.println("No hay ninguna sesion inicada");
					}
					
					break;	
				case 4:
					System.out.println("Saliendo del programa..");
					break;
				
			}
			}while(opcion != 4) ;
				
			leer.close();
		
	}
	public static void MenuInvitado(Scanner leer) {
		int opcionInvitado;
		
		do {
			System.out.println("Menu invitado");
			System.out.println("1.Consultar informacion");
			System.out.println("0.Volver al menu principal");
			System.out.println("Elegir una opcion");
			
			opcionInvitado = leer.nextInt();
			leer.nextLine();
			
			switch(opcionInvitado) {
			case 1:
				System.out.println("Consultar informacion");
				break;
				
			case 0:
				System.out.println("Volviendo a menu principal");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opcionInvitado !=0);
	}

	public static void MenuPerfil(Sesion actual,Scanner leer,ArrayList<Paciente>pacientes) {
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
								gestion.editarAlergia();
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
				System.out.println("1.Registrar pacientes");
				System.out.println("2.Gestionar empleados");
				System.out.println("3.Gestionar citas con pacientes");
				System.out.println("0.Volver al menu principal");
				
				int opcionsecretariado = leer.nextInt();
				leer.nextLine();
				
					switch(opcionsecretariado) {
					case 1:
						System.out.println("1.Registrar pacientes");
						registrarPaciente(leer,pacientes);
						break;
						
					case 2:
						System.out.println("2.Gestionar empleados");
						break;
						
					case 3:
						System.out.println("3.Gestionar citas con pacientes");
						break;
						
					case 0: 
						System.out.println("0.Volver al menu principal");
						break;
						
					default :
						System.out.println("Opcion no valida");
						break;
					}

				break;
			
			case enfermeria:
				System.out.println("Menu enfermeria");
				System.out.println("1.Registrar revision");
				System.out.println("2.Registrar intervencion");
				System.out.println("3.Actualizar el informe de tratamiento");
				System.out.println("0.Volver al menu principal");
				System.out.println("Elegir opcion");
				
				int opcionEnfermeria = leer.nextInt();
				leer.nextLine();
				
				switch(opcionEnfermeria) {
					case 1:
						System.out.println("Registrar revision");
						break;
					case 2:
						System.out.println("Registrar intervencion");
						break;
						
					case 3 :
						System.out.println("Actualizar el informe de tratamiento");
						break;
					case 0:
						System.out.println("Volviendo al menu principal");
						break;
					default:
						System.out.println("Opcion no valida");
						break;
							
				}
				break;
				
			case invitado:
				System.out.println("No hay sesion iniciada");
				break;
			}

			}
		
		
	public static void registrarPaciente(Scanner leer,ArrayList<Paciente> pacientes) {
			
			System.out.println("ID del paciente");
			Long id =Long.parseLong(leer.nextLine());
			
			System.out.println("Nombre completo");
			String nombre = leer.nextLine();

			System.out.println("Fecha nacimiento (AAAA-MM-DD)");
			LocalDate fecha = LocalDate.parse(leer.nextLine());
			
			System.out.println("Telefono");
			String telefono = leer.nextLine();
			
			System.out.println("Direccion");
			String direccion = leer.nextLine();
			
			System.out.println("Nif");
			String nif = leer.nextLine();
			
			System.out.println("Email");
			String email = leer.nextLine();

			Paciente p = new Paciente(id, nombre, telefono, fecha, direccion, nif, email);
			pacientes.add(p);

			System.out.println("Paciente registrado");
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

		
