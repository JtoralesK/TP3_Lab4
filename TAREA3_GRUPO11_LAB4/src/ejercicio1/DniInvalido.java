package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException{
	public DniInvalido () 
	{
		
	}

	@Override
	public String getMessage() {
		return "El dni ingresado no es v�lido, debe contener solo numeros";
	}
}
