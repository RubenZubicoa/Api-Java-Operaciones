package de.isri.es.Editor.models;

public class MensajeTcpIp {

	private int operacion;
	private String direccionIp;
	private int puerto;
	private String mensaje;
	
	
	public MensajeTcpIp() {
		super();
	}


	public MensajeTcpIp(int operacion, String direccionIp, int puerto, String mensaje) {
		super();
		this.operacion = operacion;
		this.direccionIp = direccionIp;
		this.puerto = puerto;
		this.mensaje = mensaje;
	}


	public int getOperacion() {
		return operacion;
	}


	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}


	public String getDireccionIp() {
		return direccionIp;
	}


	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}


	public int getPuerto() {
		return puerto;
	}


	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}
