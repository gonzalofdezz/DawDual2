package pio.daw.fernandez.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceFernandez {

	private BasicPasswordEncryptor passwordEncryptor;
	
	public PwServiceFernandez() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}
		public String encriptarContrasena(String contrasena) {
			return passwordEncryptor.encryptPassword(contrasena);
		}
	
	public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}	
 }

