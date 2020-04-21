package de.isri.es.Editor.models;

public class Puesto {
	
	private int Linea;
	private int Codigo;
	private String Descripcion;
	private int PuestoAnterior;
	
	
	public Puesto() {
		super();
	}

	public Puesto(int linea, int codigo, String descripcion, int puestoAnterior) {
		super();
		Linea = linea;
		Codigo = codigo;
		Descripcion = descripcion;
		this.PuestoAnterior = puestoAnterior;
	}

	public int getLinea() {
		return Linea;
	}

	public void setLinea(int linea) {
		Linea = linea;
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

	public int getPuestoAnterior() {
		return PuestoAnterior;
	}

	public void setPuestoAnterior(int puestoAnterior) {
		PuestoAnterior = puestoAnterior;
	}
	
	
	
	

}
