package de.isri.es.Editor.Dao;

import de.isri.es.Editor.models.InformePuestos;

public interface InformesDAO {

	//Aqui estaran todos los metodos que devuelvan informacion para graficos o informes
	public InformePuestos getInformePuestos(int modelo);
}
