package de.isri.es.Editor.models;

public class Dessouter {

	private int idEquipo;
	private String codigo;
	private String ip;
	private int puerto;
	
	private Equipo equipo;
	
	

	public Dessouter() {
		super();
	}

	
	
	
	public Dessouter(int idEquipo, String codigo, String ip, int puerto, Equipo equipo) {
		super();
		this.idEquipo = idEquipo;
		this.codigo = codigo;
		this.ip = ip;
		this.puerto = puerto;
		this.equipo = equipo;
	}




	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	
	
	
}
