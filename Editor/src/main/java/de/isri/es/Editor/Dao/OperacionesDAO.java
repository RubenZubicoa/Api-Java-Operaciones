package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Material;
import de.isri.es.Editor.models.Operacion;

public interface OperacionesDAO {

	public List<Operacion> getOperaciones();	
	
	public Operacion insertOperacion(Operacion operacion);
	
	public Operacion updateOperacion(int id, Operacion operacion);
	
	public Operacion deleteOperacion(int id);
	
	//Obtiene la lista de operaciones filtrando por un material asignado a ella
	public List<Operacion> getOperacionesPorMaterial(Material material);
	
	
}
