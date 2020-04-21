package de.isri.es.Editor.models;

import java.util.List;

public class InformePuestos {

	private List<Integer> puestos;
	private List<Float> tiempos;
	
	public InformePuestos() {
		
	}
	
	public InformePuestos(List<Integer> puestos, List<Float> tiempos) {
		this.puestos = puestos;
		this.tiempos = tiempos;
	}

	public List<Integer> getPuestos() {
		return puestos;
	}

	public void setPuestos(List<Integer> puestos) {
		this.puestos = puestos;
	}

	public List<Float> getTiempos() {
		return tiempos;
	}

	public void setTiempos(List<Float> tiempos) {
		this.tiempos = tiempos;
	}
	
	
}
