package de.isri.es.Editor.Dao.Impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import de.isri.es.Editor.Dao.OpenProtocolDAO;

public class OpenProtocol implements OpenProtocolDAO {

	private Socket socket;

	@Override
	public String sendCommand(String host, int puerto, String command) {		
		try {
			InetAddress address = InetAddress.getByName(host);
			socket = new Socket(address, puerto);
			
			//Si el usuario manda un comando que no es el de iniciar sesion, se manda el comando de iniciar sesion antes de mandar el comando del usuario
			if(command != "00200001003000000000") {
				DataOutputStream output = new DataOutputStream(socket.getOutputStream());
				String mensaje = "00200001003000000000\0";
				byte[] bytes = mensaje.getBytes(StandardCharsets.US_ASCII);
				output.write(bytes);
			}
			//Send message to the server
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			String mensaje = command + "\0";
			byte[] bytes = mensaje.getBytes(StandardCharsets.US_ASCII);
			output.write(bytes);
			//Get the return message from the server
			InputStream input = socket.getInputStream();	
			InputStreamReader inputReader = new InputStreamReader(input);
			BufferedReader bufferedReader = new BufferedReader(inputReader);
			String response = bufferedReader.readLine();
			return response;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
