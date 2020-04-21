package de.isri.es.Editor.models;

public class Linea {

	private int Codigo;
	private String Descripcion;	
	
	
	
	public Linea() {
		super();
	}


	public Linea(int codigo, String descripcion) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
	}
	
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
