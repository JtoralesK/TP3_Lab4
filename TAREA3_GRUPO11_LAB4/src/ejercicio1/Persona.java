package ejercicio1;

public class Persona implements Comparable<Persona>{
	
	String nombre;
	String apellido;
	String dni;
	
	public Persona() {
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
		this.dni = "";
	}
	
	public Persona(String apellido, String nombre, String dni) {
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
	@Override
	public String toString() {
		return apellido+"-"+nombre+"-"+dni;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public static boolean verificarDniInvalido(String dni) throws DniInvalido
	{
	    if( dni.matches("[0-9]+")) return true;
	    throw new DniInvalido();
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.toString().compareToIgnoreCase(o.toString());
	}
	
	
}



















