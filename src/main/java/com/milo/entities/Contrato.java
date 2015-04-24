package entities;

import java.util.List;

public class Contrato {
	private Integer id;
	private String codigo;
	private Oficina oficina;
	private List <Cliente> listaClientes;
	private List <Documento> listaDocumentos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Oficina getOficina() {
		return oficina;
	}
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	public List <Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List <Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}
