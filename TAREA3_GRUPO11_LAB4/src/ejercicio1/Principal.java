package ejercicio1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		//punto A
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
		
		
		//punto B
		FileReader input;
		BufferedReader buffer;
		TreeSet<Persona> list = new TreeSet<Persona>();
		
		try {
			input = new FileReader("Personas.txt");
			buffer = new BufferedReader(input);
			String linea = buffer.readLine();

			
			
			while(linea != null){
				String[] aux = linea.split("-");
				if(aux[0] != ""){
					try {
						Persona.verificarDniInvalido(aux[2]);
						Persona auxP = new Persona(aux[1],aux[0],aux[2]);
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
	
		//punto C
		try {
            FileWriter output = new FileWriter("Resultado.txt");
            BufferedWriter writer = new BufferedWriter(output);
            
            ListIterator<Persona> it = new ArrayList<>(list).listIterator();

            while (it.hasNext()) {
                Persona persona = it.next();
                writer.write(persona.toString());
                writer.newLine();
            }

            writer.close();
            output.close();
            System.out.println("Personas guardadas en Resultado.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}


}
