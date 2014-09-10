package Estructuras;
/**
 * Clase Persona
 * Crea una persona 
 * 
 * @author Adrian Soto
 *
 */
public class Persona 
{
	// Atributos
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Primer apellido de la persona
	 */
	private String apellido1;
	/**
	 * Segundo Apellido de la persona
	 */
	private String apellido2;
	/**
	 * N�mero de c�dula de la persona
	 */
	private String cedula;
	/**
	 * N�mero de tel�fono m�vil/fijo de la persona
	 */
	private String telefono;
	/**
	 * Direcci�n de correo electr�nico
	 */
	private String correoE;
	/**
	 * Categor�a de la persona
	 */
	private int categoria;
	
	// M�todos
	/**
	 * Contructor de la persona
	 * @param pNombre    : nobmre
	 * @param pApellido1 : 1er apellido
	 * @param pApellido2 : 2do apellido
	 * @param pCedula    :  n�mero de c�dula
	 * @param pTelefono  :  n�mero de tel�fono
	 * @param pCorreoE   : direcci�n de correo electr�nico
	 * @param pCategoria : categor�a de la persona
	 */
	public Persona(String pNombre, String pApellido1, String pApellido2,
			String pCedula, String pTelefono, String pCorreoE, int pCategoria)
	{
		super();
		this.setNombre(pNombre);;
		this.setApellido1(pApellido1);
		this.setApellido2(pApellido2);
		this.setCedula(pCedula);
		this.setTelefono(pTelefono);
		this.setCorreoE(pCorreoE);
		this.setCategoria(pCategoria);
	}

	/**
	 * 
	 * @param nombre
	 */
	public Persona(String nombre) 
	{
		super();
		this.nombre = nombre;
	}
	/**
	 * Get nombre
	 * @return retorna el nombre
	 */
	public String getNombre() 
	{
		return nombre;	
	}
	/**
	 * Set Nombre
	 * @param nombre recibe el nombre
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	/**
	 * Get Apellido 1
	 * @return retorna el primer el apellido
	 */
	public String getApellido1() 
	{
		return apellido1;
	}
	/**
	 * Get Apellido 1
	 * @param apellido1 recibe el primer apellido
	 */
	public void setApellido1(String apellido1) 
	{
		this.apellido1 = apellido1;
	}
	/**
	 * Get Apellido 2
	 * @return retorna el segundo apellido
	 */
	public String getApellido2() 
	{
		return apellido2;
	}
	/**
	 * Set Apellido 2
	 * @param apellido2 recibe el segundo apellido
	 */
	public void setApellido2(String apellido2) 
	{
		this.apellido2 = apellido2;	
	}
	/**
	 * Get del n�mero de tel�fono
	 * @return
	 */
	public String getTelefono() 
	{
		return telefono;
	}
	/**
	 * Set del n�mero de tel�fono 
	 * @param telefono
	 */
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}
	/**
	 * Get del correo electr�nico
	 * @return retorna el correo electr�nico
	 */
	public String getCorreoE() 
	{
		return correoE;
	}
	/**
	 * Set del correo electr�nico 
	 * @param correoE recibe el del correo electr�nico
	 */
	public void setCorreoE(String correoE) 
	{
		this.correoE = correoE;
	}
	/**
	 * Get del n�mero de cedula 
	 * @return retorna el n�mero de c�dula
	 */
	public String getCedula() 
	{
		return cedula;
	}
	/**
	 * Set del n�mero de c�dula
	 * @param cedula recibe el n�mero de c�dula
	 */
	public void setCedula(String cedula) 
	{
		this.cedula = cedula;
	}
	/**
	 * Get de la categor�a de la persona
	 * @return retorna la categor�a de la persona
	 */
	public int getCategoria() 
	{
		return categoria;
	}
	/**
	 * Set de la categor�a de la persona
	 * @param categoria recibe la categor�a de la persona
	 */
	public void setCategoria(int categoria) 
	{
		this.categoria = categoria;
	}	
}
