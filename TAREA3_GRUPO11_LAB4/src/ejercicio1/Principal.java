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
		System.out.println("-------------------------------------------------");
		System.out.println("Punto A");
		System.out.println("-------------------------------------------------");
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
		
		System.out.println("-------------------------------------------------");
		System.out.println("Punto B");
		System.out.println("-------------------------------------------------");
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
		System.out.println("-------------------------------------------------");
		System.out.println("Punto C");
		System.out.println("-------------------------------------------------"+"\n");
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
            System.out.println("Personas guardadas en Resultado.txt :");
        } catch (IOException e) {
            e.printStackTrace();
        }
		FileReader Entrada2;
		BufferedReader miBuffer2;
		try {
			Entrada2 = new FileReader("Resultado.txt");
			miBuffer2 = new BufferedReader(Entrada2);
			String linea= "";
			while(linea!=null) {
				System.out.println(linea);
				linea = miBuffer2.readLine();
			}
			Entrada2.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n"+"-------------------------------------------------"+"\n");
	}


}
