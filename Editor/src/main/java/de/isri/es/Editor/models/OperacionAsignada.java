package de.isri.es.Editor.models;

public class OperacionAsignada {
	
	private int IdModelo;
	private int CodigoPuesto;
	private int IdOperacion;
	private int Prioridad;
	private Modelo modelo;
	private Puesto puesto;
	private Operacion operacion;
	
	
	public OperacionAsignada() {
		super();
	}


	public OperacionAsignada(int idModelo, int codigoPuesto, int idOperacion, int prioridad, Modelo modelo,
			Puesto puesto, Operacion operacion) {
		super();
		IdModelo = idModelo;
		CodigoPuesto = codigoPuesto;
		IdOperacion = idOperacion;
		Prioridad = prioridad;
		this.modelo = modelo;
		this.puesto = puesto;
		this.operacion = operacion;
	}


	public int getIdModelo() {
		return IdModelo;
	}


	public void setIdModelo(int idModelo) {
		IdModelo = idModelo;
	}


	public int getCodigoPuesto() {
		return CodigoPuesto;
	}


	public void setCodigoPuesto(int codigoPuesto) {
		CodigoPuesto = codigoPuesto;
	}


	public int getIdOperacion() {
		return IdOperacion;
	}


	public void setIdOperacion(int idOperacion) {
		IdOperacion = idOperacion;
	}


	public int getPrioridad() {
		return Prioridad;
	}


	public void setPrioridad(int prioridad) {
		Prioridad = prioridad;
	}


	public Modelo getModelo() {
		return modelo;
	}


	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}


	public Puesto getPuesto() {
		return puesto;
	}


	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}


	public Operacion getOperacion() {
		return operacion;
	}


	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}
	
	
	
	
	
	

}
