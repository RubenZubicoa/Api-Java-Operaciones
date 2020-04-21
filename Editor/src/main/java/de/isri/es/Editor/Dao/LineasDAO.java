package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Linea;

public interface LineasDAO {

	public List<Linea> getLineas();
	public Linea insertLinea(Linea linea);
	public Linea updateLinea(int codigo, Linea linea);
	public Linea deleteLinea(int codigo);
}
