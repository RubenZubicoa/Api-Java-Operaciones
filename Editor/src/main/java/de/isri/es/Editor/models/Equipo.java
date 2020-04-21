package de.isri.es.Editor.models;

public class Equipo {

	private int idPuesto;
	private String descripcion;
	private String direccionIp;
	
	private Puesto puesto;

	public Equipo() {
		super();
	}

	public Equipo(int idPuesto, String descripcion, String direccionIp, Puesto puesto) {
		super();
		this.idPuesto = idPuesto;
		this.descripcion = descripcion;
		this.direccionIp = direccionIp;
		this.puesto = puesto;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccionIp() {
		return direccionIp;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	
	
	
}
