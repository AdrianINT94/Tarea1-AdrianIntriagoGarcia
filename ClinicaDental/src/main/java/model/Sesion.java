package model;

public class Sesion {
	
	private Sesion sesion;
	private String username;
	private String nombre;
	private String perfil ;
	private boolean activo ;
	
	
	public Sesion() {
		
	}
	public Sesion(Sesion sesion, String username, String nombre, String perfil, boolean activo) {
		super();
		this.sesion = sesion;
		this.username = username;
		this.nombre = nombre;
		this.perfil = perfil;
		this.activo = activo;
	}


	public Sesion getSesion() {
		return sesion;
	}


	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	// motodo cerrar sesion
	public void cerrarSesion() {
		
	}


	@Override
	public String toString() {
		return "Sesion [sesion=" + sesion + ", username=" + username + ", nombre=" + nombre + ", perfil=" + perfil
				+ ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
}
