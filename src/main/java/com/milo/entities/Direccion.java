package entities;

public class Direccion {
	private Integer id;
	private String calle;
	private String ciudad;
	private String ccaa;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCcaa() {
		return ccaa;
	}
	public void setCcaa(String ccaa) {
		this.ccaa = ccaa;
	}

}
