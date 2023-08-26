package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		try {
			Persona.verificarDniInvalido("41544556");
			System.out.println("dni verificado");
		} catch (DniInvalido e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Persona.verificarDniInvalido("qweqweqwe");
			System.out.println("dni verificado");
		} catch (DniInvalido e) {
			System.out.println(e.getMessage());
		}
	}

}
