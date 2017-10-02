package parkingPrivado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>Clase con una lista de usuarios y con metodos
 * para escritura y lectura de ellos en fichero.</p> 
 * 
 * @author Ismael P.
 *
 */
public class RegistroParking {

	// Creamos una lista de la clase Usuario.
	List <Usuario> listaParking = new ArrayList <Usuario>();
	
	/**
	 * <p>Metodo para insertar un Usuario en la lista
	 * de Usuario.</p>
	 * 
	 * @param us
	 */
	public void insertarUsuario (Usuario us){
		listaParking.add(us);
	}
	
	
	/**
	 * <p>Metodo para escribir en fichero la lista de Usuarios.</p> 
	 */
	public void escribir(){
		
		// Ponemos la ruta de nuestro archivo con la lista de Usuarios, que en nuestro caso es la siguiente: 
		// /Users/ismael/Desktop/RegistroParking.txt
		try {
			FileWriter escribirRegistro = new FileWriter("/Users/ismael/Desktop/RegistroParking.txt");
			
			for (Usuario us : listaParking)
			escribirRegistro.write(us.toString());
			escribirRegistro.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo " + e);
		}

	}
	
	/**
	 * <p>Metodo para escribir en fichero la lista de Usuarios
	 * sin duplicados gracias a la lista HashSet utilizada en este metodo.</p> 
	 */
	public void escribirSinDuplicados(){
	
		// Creamos una lista HashSet, que no permite duplicados, pasandole al final nuestra lista de ArrayList
		Set <Usuario> listaParkingSinDuplicados = new HashSet <Usuario> (listaParking);
	
		// Ponemos la ruta de nuestro archivo con la lista de Usuarios sin duplicados, que en nuestro caso es la siguiente:
		// /Users/ismael/Desktop/RegistroSinDuplicados.txt
		try {
			FileWriter escribirRegistro = new FileWriter("/Users/ismael/Desktop/RegistroSinDuplicados.txt");
		
			for (Usuario us : listaParkingSinDuplicados){
				escribirRegistro.write(us.getMatricula() + " " + us.getNombre() + " " + us.getApellido1() 
				+ " " + us.getApellido2() + "\n" + "\n");
			}	
			escribirRegistro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo " + e);
		}

	}

	/**
	 * <p>Metodo para leer la lista de Usuarios del fichero.</p>
	 */
	public void leer(){
		String texto = new String();
	
		// Ponemos la ruta donde esta nuestro fichero, que en nuestro caso es:
		// /Users/ismael/Desktop/RegistroSinDuplicados.txt
		try {
			FileReader leerRegistro = new FileReader("/Users/ismael/Desktop/RegistroParking.txt");
			BufferedReader entrada = new BufferedReader(leerRegistro);
			String s;
			while ((s=entrada.readLine()) != null){  // lee una linea de texto hasta que no haya un salto de linea \n 
			texto+=(s + "\n");					    // y lo guarda en la vasriable "s".
		}
		System.out.println(texto);
		entrada.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo " + e);
		}

	}

	/**
	 * <p>Metodo para leer la lista de Usuarios del fichero sin duplicados.</p>
	 */
	public void leerSinDuplicados(){
		String texto = new String();
	
		// Ponemos la ruta donde esta nuestro fichero sin duplicados, que en nuestro caso es:
		// /Users/ismael/Desktop/RegistroSinDuplicados.txt
		try {
			FileReader leerRegistro = new FileReader("/Users/ismael/Desktop/RegistroSinDuplicados.txt");
			BufferedReader entrada = new BufferedReader(leerRegistro);
			String s;
			while ((s=entrada.readLine()) != null){  // lee una linea de texto hasta que no haya un salto de linea \n 
			texto+=(s + "\n");					    // y lo guarda en la vasriable "s".
		}
		System.out.println(texto);
		entrada.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo " + e);
		}

	}
	
	/**
	 * <p>Metodo para contar las apariciones de una misma matricula en la lista,
	 * con la utilizacion del equals definido en la clase de Usuario.</p>
	 */
	public void contarAparicionesMatricula(){
		//creamos una lista HashSet, que no permite duplicados, pasandole al final nuestra lista de ArrayList
		Set <Usuario> listaParkingSinDuplicados = new HashSet <Usuario> (listaParking);
		for(Usuario us:listaParkingSinDuplicados){
			if(!us.equals(listaParkingSinDuplicados)){
				System.out.println(us.getMatricula() + ":" + Collections.frequency(listaParking, us));
			}
		}
	}
	
}
