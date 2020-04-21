package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.isri.es.Editor.Dao.MensajesTcpIpDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.MensajeTcpIp;

public class MensajesTcpIp implements MensajesTcpIpDAO {

	@Override
	public MensajeTcpIp getMensaje(int operacion) {
		String sql = "Select * from Mensajes_TcpIp where operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			MensajeTcpIp mensaje = new MensajeTcpIp();
			while(rs.next()) {				
				mensaje.setOperacion(rs.getInt(1));
				mensaje.setDireccionIp(rs.getString(2));
				mensaje.setPuerto(rs.getInt(3));
				mensaje.setMensaje(rs.getString(4));
			}			
			return mensaje;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MensajeTcpIp insertMensaje(MensajeTcpIp mensaje) {
		String sql = "insert into Mensajes_TcpIp(Operacion, DireccionIp, Puerto, Mensaje) values(?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, mensaje.getOperacion());
			stmt.setString(2, mensaje.getDireccionIp());
			stmt.setInt(3, mensaje.getPuerto());
			stmt.setString(4, mensaje.getMensaje());
			stmt.execute();
			return mensaje;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MensajeTcpIp updateMensaje(int operacion, MensajeTcpIp mensaje) {
		String sql = "update Mensajes_TcpIp set Operacion = ?, DireccionIp = ?, Puerto = ?, Mensaje = ? where operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, mensaje.getOperacion());
			stmt.setString(2, mensaje.getDireccionIp());
			stmt.setInt(3, mensaje.getPuerto());
			stmt.setString(4, mensaje.getMensaje());
			stmt.setInt(5, operacion);
			stmt.execute();
			return mensaje;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MensajeTcpIp deleteMensaje(int operacion) {
		String sql = "delete from Mensajes_TcpIp where operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.execute();
			return new MensajeTcpIp();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
