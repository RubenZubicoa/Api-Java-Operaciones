package de.isri.es.Editor.models;

public class Modelo {

	private int id;
	private String referencia;
	private int linea;
	private float montaje;
	private float respaldo;
	private float cojin;
	private float expediciones;
	
	public Modelo() {
		super();
	}

	public Modelo(int id, String referencia, int linea, float montaje, float respaldo, float cojin,
			float expediciones) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.linea = linea;
		this.montaje = montaje;
		this.respaldo = respaldo;
		this.cojin = cojin;
		this.expediciones = expediciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public float getMontaje() {
		return montaje;
	}

	public void setMontaje(float montaje) {
		this.montaje = montaje;
	}

	public float getRespaldo() {
		return respaldo;
	}

	public void setRespaldo(float respaldo) {
		this.respaldo = respaldo;
	}

	public float getCojin() {
		return cojin;
	}

	public void setCojin(float cojin) {
		this.cojin = cojin;
	}

	public float getExpediciones() {
		return expediciones;
	}

	public void setExpediciones(float expediciones) {
		this.expediciones = expediciones;
	}
	
	
	
}
