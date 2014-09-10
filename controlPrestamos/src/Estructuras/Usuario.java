package Estructuras;
/**
 * 
 * @author Samantha Arburola
 *
 */
public class Usuario extends Persona
{
	// Atributos
	/**
	 * Contrase�a del usuario
	 */
	private String contrase�a;
	/**
	 * nickname del usuario
	 */
	private String nikname;
	/**
	 * Construcci�n de usuario
	 * @param nombre      : nombre
	 * @param pNickName   : nickname o seud�nimo
	 * @param pContrase�a : contrase�a del usuario
	 */
	public Usuario(String nombre, String pNickName ,String pContrase�a) {
		super(nombre);
		this.setContrase�a(pContrase�a);
		this.setNikname(pNickName);
	}
	/**
	 * Get contrase�a
	 * @return contrase�a
	 */
	public String getContrase�a() {return contrase�a;}
	/**
	 * Set contrase�a
	 * @param contrase�a recibe la contrase�a del usuario
	 */
	public void setContrase�a(String contrase�a){this.contrase�a = contrase�a;}
	/**
	 * Get nickname
	 * @return nickname del usuario
	 */
	public String getNikname() {return nikname;}
	/**
	 * Set nickname
	 * @param nikname recibe el seud�nimo del usuario
	 */
	public void setNikname(String nikname) {this.nikname = nikname;}
}