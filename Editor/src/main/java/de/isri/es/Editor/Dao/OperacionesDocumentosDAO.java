package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.OperacionDocumento;

public interface OperacionesDocumentosDAO {

	//Obtiene los doscumento asignados a una operacion
	public List<OperacionDocumento> getDocumentosDeOperacion(int operacion);
	//Asigna un documento a una operacion
	public OperacionDocumento insertOperacionDocumento(OperacionDocumento opDoc);
	//modifica la asignacion de un documento a una operacion
	public OperacionDocumento updateOperacionDocumento(int operacion, int documento, OperacionDocumento opDoc);
	//elimina una asignacion
	public OperacionDocumento deleteOperacionDocumento(int operacion, int documento);
}
