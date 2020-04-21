package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.SerialPort;

public interface SerialPortsDAO {

	public SerialPort getSerialPort(int equipo);
	public SerialPort insertSerialPort(SerialPort port);
	public SerialPort updateSerialPort(int equipo, SerialPort port);
	public SerialPort deleteSerialPort(int equipo);
}
