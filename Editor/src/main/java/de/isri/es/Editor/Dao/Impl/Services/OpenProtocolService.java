package de.isri.es.Editor.Dao.Impl.Services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import de.isri.es.Editor.Dao.OpenProtocolDAO;
import de.isri.es.Editor.Dao.Impl.OpenProtocol;

@Path("open-protocol")
public class OpenProtocolService implements OpenProtocolDAO {
	
	private OpenProtocol openProtocol = new OpenProtocol();

	@Override
	@GET
	@Path("/send/{host}/{puerto}/{command}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sendCommand(@PathParam("host") String host, @PathParam("puerto") int puerto, @PathParam("command") String command) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		return gson.toJson(this.openProtocol.sendCommand(host, puerto, command));
	}

}
