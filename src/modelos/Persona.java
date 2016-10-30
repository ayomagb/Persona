package modelos;

public class Persona {
	//atributos
	private int id;
	private String nombre;
	private char sexo;
	//constructor por defecto
	public Persona() {
		super();
	}
	//constructor con parámetros
	public Persona(int id, String nombre, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	//consultores
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public char getSexo() {
		return sexo;
	}
	//modificadores
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	//String toString()
	public String toString(){
		return this.id+", "+this.nombre+", "+this.sexo;
	}
}
