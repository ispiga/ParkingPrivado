package parkingPrivado;

/**
 * <p>Clase con atributos para el Usuario del vehiculo. 
 * Metodo equals para determinar cuando dos matriculas 
 * son iguales. Metodo toString modificado.</p>
 * 
 * @author Ismael P.
 * 
 */
public class Usuario {

	// Atributos 
	private String matricula;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechaHora;
	
	/**
	 * Metodo constructor del Usuario.
	 * 
	 * @param matricula
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param fechaHora
	 */
	public Usuario(String matricula, String nombre, String apellido1,
			String apellido2, String fechaHora) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaHora = fechaHora;
	}
	
	/**
	 * @return String
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * @return String 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	/**
	 * @return apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	
	/**
	 * @param apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	/**
	 * @return fechaHora
	 */
	public String getFechaHora() {
		return fechaHora;
	}
	
	/**
	 * @param fechaHora
	 */
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	/**
	 * <p>hashCode para el equals que determina
	 * si dos matriculas dos iguales.</p>
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}
	
	
	//---------------------------------------------------------------
	//Este equals es el generado por eclipse.
	/*  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	*/
	//-----------------------------------------------------------------
	
	
	//Este equals es otra forma valida generado por nosotros.
	
	/**
	 * <p>equals que define cuando dos 
	 * matriculas son iguales.</p>
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Usuario){
		Usuario usuario = (Usuario)obj;
		if(this.getMatricula().equals(usuario.getMatricula())){
			return true;
		}else{
			return false;
		}
		}else{
			return false;
		}
	}
	
	/**
	 * <p>Metodo toString modificado.</p>
	 * 
	 * @return matricula + nombre + apellido1 + apellido2 + fechaHora
	 */
	@Override
	public String toString() {
		return matricula + " " + nombre + " " + apellido1 + " " + apellido2 + " " + fechaHora + "\n" + "\n";
	}
	
}
