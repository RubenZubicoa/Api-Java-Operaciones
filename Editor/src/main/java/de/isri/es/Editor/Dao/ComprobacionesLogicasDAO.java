package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.ComprobacionLogica;

public interface ComprobacionesLogicasDAO {

	public List<ComprobacionLogica> getComprobacionesDeOperacion(int operacion);
	public ComprobacionLogica insertComprobacion(ComprobacionLogica comprobacion);
	public ComprobacionLogica updateComprobacion(int id, ComprobacionLogica comprobacion);
	public ComprobacionLogica deleteComprobacion(int id);
}
