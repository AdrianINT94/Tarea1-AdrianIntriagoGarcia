package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {
	
	//Acceder a application.properties

		private Properties propiedades = new Properties();
		
		public Configuracion() {
			
			try {
				InputStream entrada = getClass().getClassLoader().getResourceAsStream("application.properties");
			
				if(entrada != null) {
					propiedades.load(entrada);
					entrada.close();
				}else {
					System.out.println("No se encuentra application.properties");
				}
				
			}catch(IOException e) {
				System.out.println("Error al leer la configuration " + e.getMessage());
			}
		}

		public Properties getPropiedades() {
			return propiedades;
		}

		public void setPropiedades(Properties propiedades) {
			this.propiedades = propiedades;
		}
		
		//añadido (mirar)
		public String getAdminUsername() {
			return propiedades.getProperty("admin.username");
		}
		public String getAdminPassword() {
			return propiedades.getProperty("admin.password");
		}
		
}
