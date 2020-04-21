package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.OperacionAsignada;

public interface OperacionesAsignadasDAO {

	//Obtiene todos los registros de la tabla operaciones asignadas filtrando por operacion
	public List<OperacionAsignada> getAsignacionesDeOperaciones(int operacion);	
	
	//introduce un regitro en la tabla operaciones asignadas
	public OperacionAsignada insertOperacionAsignada(OperacionAsignada operacion);
	
	//modifica un registro en la tabla operaciones asignadas
	public OperacionAsignada updateOperacionAsignada(int modelo, int puesto, int operacion, OperacionAsignada operacionAsignada);
	
	//elimina un registro de la tabla operaciones asignadas
	public OperacionAsignada deleteOperacionAsignada(int modelo, int puesto, int operacion);
	
	//devuelve una lista de operaciones filtrando por modelo y puesto
	public List<OperacionAsignada> getOperacionesPorModeloYPuesto(int modelo, int puesto);
	
	//Develve la lista de operaciones filtrando solo por modelo
	public List<OperacionAsignada> getOperacionesPorModelo(int modelo);
}
