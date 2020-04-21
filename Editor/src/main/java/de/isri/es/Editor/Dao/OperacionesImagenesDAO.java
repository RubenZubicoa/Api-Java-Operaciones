package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.OperacionImagen;

public interface OperacionesImagenesDAO {

	//Devuelve las imagenes asignadas a una operacion
	public List<OperacionImagen> getImagenesDeOperacion(int operacion);
	//asigna una imagen a una operacion
	public OperacionImagen insertOperacionImagen(OperacionImagen opImg);
	//cambia la imagen asignada de una operacion
	public OperacionImagen updateOperacionImagen(int operacion, int imagen, OperacionImagen opImg);
	//elimina la asignacion de una imagen a una operacion
	public OperacionImagen deleteOperacionImagen(int operacion, int imagen);
}
