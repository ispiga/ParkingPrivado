package parkingPrivado;

/**
 * <p>Clase que contiene metodo main de ejecucion, donde creamos
 * objetos de la clase Usuario y le aplicamos metodos de insercion
 * en la lista, metodos de lectura y escritura de fichero.</p>
 * @author ismael
 *
 */
public class TestRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos algunos usuarios.
		Usuario usuario1 = new Usuario ("4112GMR","Pepe","Gómez","Rodríguez","28/4/2016 13:23:04");
		Usuario usuario2 = new Usuario ("28995YZX","María","Domínguez","Beltrán","3/5/2016 18:31:32");
		Usuario usuario3 = new Usuario ("9889BLM","Manuel","Fernández","Anselmo","13/5/2016 9:21:18");
		Usuario usuario4 = new Usuario ("6134FSZ","Daniel","Vera","Jiménez","17/5/2016 21:12:00");
		Usuario usuario5 = new Usuario ("1852DHJ","Jorge","Márquez","Ruiz","17/5/2016 21:42:08");
		Usuario usuario6 = new Usuario ("4112GMR","Ismael","Gómez","Rodríguez","28/4/2016 19:55:12");
		
		// Creamos un objeto de la clase RegistroPaking, para posteriormente poderle aplicar 
		// los metodos de esa clase.
		RegistroParking registro = new RegistroParking();
		
		// Insertamos los usuarios creados anteriormente, con el metodo insertarUsuario de la clase RegistroParkin.
		registro.insertarUsuario(usuario1);
		registro.insertarUsuario(usuario2);
		registro.insertarUsuario(usuario3);
		registro.insertarUsuario(usuario4);
		registro.insertarUsuario(usuario5);
		registro.insertarUsuario(usuario2);
		registro.insertarUsuario(usuario1);
		registro.insertarUsuario(usuario6);
		
		
		// A CONTINUACION APLICAMOS LOS DISTINTOS METODOS DE LA CLASE RegistroParking, AL OBJETO REGISTRO
		// CREADO ANTERIORMENTE.
		// PARA APLICAR UNO U OTRO, DESCOMENTAR EL METODO QUE INTERESE.
		
		//----------------------------------------------------------------------------------------------------
		
		// LE APLICAMOS AL REGISTRO EL METODO escribir, EL CUAL ESCRIBIRA EN EL ARCHIVO 
		// RegistroParking.txt EL ARRAY QUE CONTIENE TODOS LOS USUARIOS QUE HEMOS INSERTADO ANTERIORMENTE 
		// EN EL REGISTRO.
		
		//System.out.println("*****ESCRITURA REGISTRO PARKING*****");
		registro.escribir();
		
		//----------------------------------------------------------------------------------------------------
		
		// LE APLICAMOS AL REGISTRO EL METODO leer(), EL CUAL LEERA EL ARCHIVO RegistroParking.txt
		// CON LOS REGISTROS DE USUARIOS QUE CONTIENEN.
		// SI AÑADIMOS UN REGISTRO DE USUARIO EN EL MISMO ARCHIVO TXT, LO LEE IGUALMENTE. 
		
		//System.out.println("*****LECTURA REGISTRO PARKING*****");
		//registro.leer();
		
		//----------------------------------------------------------------------------------------------------
		
		// LE APLICAMOS AL REGISTRO EL METODO escribirSinDuplicados(), EL CUAL ESCRIBIRA EN EL ARCHIVO 
		// RegistroSinDuplicados.txt EL ARRAY QUE CONTIENE TODOS LOS USUARIOS QUE HEMOS INSERTADO ANTERIORMENTE 
		// EN EL REGISTRO, PERO SIN ESCRIBIR LOS USUARIOS DUPLICADOS, EL CUAL LOS ESCRIBIRA UNA VEZ SOLO,
		// SIGUIENDO LA REGLA QUE PUSIMOS EN EL equals DE QUE DOS USUARIOS SERAN IGUALES
		// CUANDO SUS MATRICULAS COINCIDAN.
		
		//System.out.println("*****ESCRITURA REGISTRO PARKING SIN DUPLICADOS*****");
		//registro.escribirSinDuplicados();
		
		
		//----------------------------------------------------------------------------------------------------
		
		// LE APLICAMOS AL REGISTRO EL METODO leerSinDuplicados(), EL CUAL LEERA EL ARCHIVO RegistroSinDuplicados.txt
		// CON LOS REGISTROS DE USUARIOS QUE CONTIENEN.
		// SI AÑADIMOS UN REGISTRO DE USUARIO EN EL MISMO ARCHIVO TXT, LO LEE IGUALMENTE. 
		
		//System.out.println("*****LECTURA REGISTRO PARKING SIN DUPLICADOS*****");
		//registro.leerSinDuplicados();
		
		//----------------------------------------------------------------------------------------------------
		
		// LE APLICAMOS AL REGISTRO EL METODO contarAparicionesMatricula(), EL CUAL NOS SACARA POR CONSOLA EL NUMERO 
		// DE VECES QUE SALE UNA MISMA MATRICULA.
		
		//System.out.println("*****NUMERO DE APARICIONES DE MATRICULAS*****");
		//registro.contarAparicionesMatricula();
			
	}

}
