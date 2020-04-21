package de.isri.es.Editor.Dao;

public interface OpenProtocolDAO {

	public String sendCommand(String host, int puerto, String command);
}
