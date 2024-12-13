package pio.daw.fernandez.encriptador;

public class PwServiceFernandezTest {
	
	public static void main(String[] args) {
		PwServiceFernandez servicio = new PwServiceFernandez();
		String password = "miSuperPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno Fernandez");
		System.out.println("La contraseña encriptada es: "+passwordEncriptada);
		
		//Vamos a verificarlo
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.print("La contrasena encriptada es valida: "+esValida);
	}

}
