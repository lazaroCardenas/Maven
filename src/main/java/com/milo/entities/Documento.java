package entities;

public class Documento {
	private Integer id;
	private String tipo;
	private String formato;
	private Byte [] datos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public Byte[] getDatos() {
		return datos;
	}
	public void setDatos(Byte[] datos) {
		this.datos = datos;
	}
	
}
