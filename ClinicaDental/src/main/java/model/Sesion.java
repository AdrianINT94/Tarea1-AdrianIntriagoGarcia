package model;

public class Sesion {
	
	
	private String username;
	private String nombre;
	private Perfil perfil ;
	private boolean activo ;
	
	public Sesion() {
		
	}
	public Sesion( String username, String nombre, Perfil perfil, boolean activo) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.perfil = perfil;
		this.activo = activo;
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


	public Perfil getPerfil() {
		return perfil;
	}


	public void setPerfil(Perfil perfil) {
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
		username = null;
		nombre = null;
		perfil = Perfil.invitado;
		activo = false;
	}


	@Override
	public String toString() {
		return "Sesion [, username=" + username + ", nombre=" + nombre + ", perfil=" + perfil
				+ ", activo=" + activo + "]";
	}

	
}
