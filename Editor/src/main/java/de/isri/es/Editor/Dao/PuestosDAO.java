package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Puesto;

public interface PuestosDAO {
	
	public List<Puesto> getPuestos();	
	public Puesto insertPuesto(Puesto puesto);
	public Puesto updatePuesto(int codigo, Puesto puesto);
	public Puesto deletePuesto(int codigo);
	public List<Puesto> getPuestosPorLinea(int linea);
	//Obtiene la lista de puestos asignados a una operacion para el montaje de un modelo de butaca
	public List<Puesto> getPuestosAsignados(int operacion, int modelo);
}
