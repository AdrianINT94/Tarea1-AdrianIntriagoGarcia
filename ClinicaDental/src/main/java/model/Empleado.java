package model;

public class Empleado {

		private Long id;
		private String nombre;
		private String apellidos;
		private String telefono;
		private String nif;
		private String direccion;
		private String email;
		public Empleado() {
			
		}
		public Empleado(Long id, String nombre, String apellidos, String telefono, String nif, String direccion,
				String email) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.nif = nif;
			this.direccion = direccion;
			this.email = email;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getNif() {
			return nif;
		}
		public void setNif(String nif) {
			this.nif = nif;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
					+ ", nif=" + nif + ", direccion=" + direccion + ", email=" + email + "]";
		}

		
		
}
