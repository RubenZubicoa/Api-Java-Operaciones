package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Dessouter;

public interface DessoutersDAO {

	public Dessouter getDessouter(int equipo);	
	public Dessouter updateDessouter(int equipo, Dessouter dessouter);
	public Dessouter insertDessouter(Dessouter dessouter);
}
