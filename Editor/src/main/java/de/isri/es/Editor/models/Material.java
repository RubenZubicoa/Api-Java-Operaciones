package de.isri.es.Editor.models;

public class Material {
	
	private int Id;
	private String Referencia;
	private String Descripcion;	
	
	
	public Material() {
		super();
	}

	public Material(int id, String referencia, String descripcion) {
		super();
		Id = id;
		Referencia = referencia;
		Descripcion = descripcion;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	

}
