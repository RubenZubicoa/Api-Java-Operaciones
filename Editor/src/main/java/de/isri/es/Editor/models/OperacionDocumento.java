package de.isri.es.Editor.models;

public class OperacionDocumento {

	private int idOperacion;
	private int idDocumento;	
	private Operacion operacion;
	private String ruta;
	
	
	public OperacionDocumento() {
		super();
	}


	public OperacionDocumento(int idOperacion, int idDocumento, Operacion operacion, String ruta) {
		super();
		this.idOperacion = idOperacion;
		this.idDocumento = idDocumento;
		this.operacion = operacion;
		this.ruta = ruta;
	}


	public int getIdOperacion() {
		return idOperacion;
	}


	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}


	public int getIdDocumento() {
		return idDocumento;
	}


	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
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
