package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Equipo;

public interface EquiposDAO {

	//Devuelve todos los registros de la tabla equipos
	public List<Equipo> getEquipos();
	//introduce un equipo en la tabla equipos
	public Equipo insertEquipo(Equipo equipo);
	//modifica un equipo
	public Equipo updateEquipo(int puesto, Equipo equipo);
	//elimina un equipo
	public Equipo deleteEquipo(int puesto);
}
