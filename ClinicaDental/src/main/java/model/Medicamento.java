package model;

import java.io.Serializable;

public class Medicamento implements Serializable{

		private Long id;
		private String nombre;
		private String principio;
		private int dosis;
		
		public Medicamento() {
		}

		public Medicamento(Long id, String nombre, String principio, int dosis) {
			this.id = id;
			this.nombre = nombre;
			this.principio = principio;
			this.dosis = dosis;
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

		public String getPrincipio() {
			return principio;
		}

		public void setPrincipio(String principio) {
			this.principio = principio;
		}

		public int getDosis() {
			return dosis;
		}

		public void setDosis(int dosis) {
			this.dosis = dosis;
		}

		@Override
		public String toString() {
			return "Medicamento [id=" + id + ", nombre=" + nombre + ", principio=" + principio + ", dosis=" + dosis
					+ "]";
		}
		
		
}
