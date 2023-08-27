package ejercicio1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		/*
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
		*/
		
		//punto B
		FileReader input;
		BufferedReader buffer;
		
		try {
			input = new FileReader("Personas.txt");
			buffer = new BufferedReader(input);
			String linea = buffer.readLine();

			TreeSet<Persona> list = new TreeSet<Persona>();
			
			while(linea != null){
				String[] aux = linea.split("-");
				if(aux[0] != ""){
					try {
						Persona.verificarDniInvalido(aux[2]);
						Persona auxP = new Persona(aux[0],aux[1],Integer.parseInt(aux[2]));
						list.add(auxP);
					}catch(DniInvalido e) {
						System.out.println(e.getMessage());
					}					
				}
				linea = buffer.readLine();
			}
			buffer.close();
			input.close();
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}


}
