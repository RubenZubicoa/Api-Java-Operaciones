package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Modelo;

public interface ModelosDAO {

	public List<Modelo> selectAll();
	public Modelo insertModelo(Modelo modelo);
	public Modelo updateModelo(int id, Modelo modelo);
	public Modelo deleteModelo(int id);
	//Obtiene la lista de modelos que estan asignados a una operacion
	public List<Modelo> getModelosAsignados(int operacion);
}
