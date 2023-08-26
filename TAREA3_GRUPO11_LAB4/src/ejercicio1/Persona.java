package ejercicio1;

public class Persona {
	
	String nombre;
	String apellido;
	int dni;
	
	public Persona() {
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
		this.dni = 0;
	}
	
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public static boolean verificarDniInvalido(String dni) throws DniInvalido
	{
	    for (int i = 0; i < dni.length(); i++) {
	        char c = dni.charAt(i);
	        if (c < '0' || c > '9') {
	            throw new DniInvalido();
	        }
	    }
	    return true;
	}
}
