package krakedev.com.inventario.entidades;

public class Categoria {
	private String nombre;
	private int codigo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Categoria(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public Categoria() {
		
	}
	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
}
