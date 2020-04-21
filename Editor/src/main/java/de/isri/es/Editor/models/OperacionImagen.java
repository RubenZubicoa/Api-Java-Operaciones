package de.isri.es.Editor.models;

public class OperacionImagen {

	private int idOperacion;
	private int idImagen;
	private Operacion operacion;
	private String ruta;
	
	
	public OperacionImagen() {
		super();
	}


	public OperacionImagen(int idOperacion, int idImagen, Operacion operacion, String ruta) {
		super();
		this.idOperacion = idOperacion;
		this.idImagen = idImagen;
		this.operacion = operacion;
		this.ruta = ruta;
	}


	public int getIdOperacion() {
		return idOperacion;
	}


	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}


	public int getIdImagen() {
		return idImagen;
	}


	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}


	public Operacion getOperacion() {
		return operacion;
	}


	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}


	public String getRuta() {
		return ruta;
	}


	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
}
