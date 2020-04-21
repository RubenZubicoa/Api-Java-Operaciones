package de.isri.es.Editor.models;

public class Operacion {
	
	private int Id;
	private String Descripcion;
	private String Categoria;
	private float Torque;
	private float Tolerancia;
	private String Utillaje;
	private float Tiempo;
	private String Texto;
	private int Proceso;
	
	
	public Operacion() {
		super();
	}


	public Operacion(int id, String descripcion, String categoria, float torque, float tolerancia,
			String utillaje, float tiempo, String texto, int proceso) {
		super();
		Id = id;
		Descripcion = descripcion;
		Categoria = categoria;
		Torque = torque;
		Tolerancia = tolerancia;
		Utillaje = utillaje;
		Tiempo = tiempo;
		Texto = texto;
		this.Proceso = proceso;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public String getCategoria() {
		return Categoria;
	}


	public void setCategoria(String categoria) {
		Categoria = categoria;
	}


	public float getTorque() {
		return Torque;
	}


	public void setTorque(float torque) {
		Torque = torque;
	}


	public float getTolerancia() {
		return Tolerancia;
	}


	public void setTolerancia(float tolerancia) {
		Tolerancia = tolerancia;
	}


	public String getUtillaje() {
		return Utillaje;
	}


	public void setUtillaje(String utillaje) {
		Utillaje = utillaje;
	}


	public float getTiempo() {
		return Tiempo;
	}


	public void setTiempo(float tiempo) {
		Tiempo = tiempo;
	}


	public String getTexto() {
		return Texto;
	}


	public void setTexto(String texto) {
		Texto = texto;
	}


	public int getProceso() {
		return Proceso;
	}


	public void setProceso(int proceso) {
		Proceso = proceso;
	}
	
	
		

}
