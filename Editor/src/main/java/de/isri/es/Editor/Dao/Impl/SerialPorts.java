package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.SerialPortsDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.SerialPort;

public class SerialPorts implements SerialPortsDAO {

	@Override
	public SerialPort getSerialPort(int equipo) {
		String sql = "select * from SerialPort where equipo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, equipo);
			ResultSet rs = stmt.executeQuery();
			SerialPort port = new SerialPort();
			if(rs.next()) {				
				port.setIdEquipo(rs.getInt(1));
				port.setSerialPort(rs.getString(2));
				port.setBaudRate(rs.getInt(3));
				port.setDataBits(rs.getInt(4));
				port.setParity(rs.getString(5));
				port.setStopBits(rs.getString(6));
				
			}
			return port;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SerialPort insertSerialPort(SerialPort port) {
		String sql = "insert into SerialPort(Equipo, SerialPort, BaudRate, DataBits, Parity, StopBits) values(?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, port.getIdEquipo());
			stmt.setString(2, port.getSerialPort());
			stmt.setInt(3, port.getBaudRate());
			stmt.setInt(4, port.getDataBits());
			stmt.setString(5, port.getParity());
			stmt.setString(6, port.getStopBits());
			stmt.execute();
			return port;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public SerialPort updateSerialPort(int equipo, SerialPort port) {
		String sql = "update SerialPort set SerialPort = ?, BaudRate = ?, DataBits = ?, Parity = ?, StopBits = ? where equipo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, port.getSerialPort());
			stmt.setInt(2, port.getBaudRate());
			stmt.setInt(3, port.getDataBits());
			stmt.setString(4, port.getParity());
			stmt.setString(5, port.getStopBits());
			stmt.setInt(6, equipo);
			stmt.execute();
			return port;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public SerialPort deleteSerialPort(int equipo) {
		String sql = "delete from serialPort where equipo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, equipo);
			stmt.execute();
			return new SerialPort();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
