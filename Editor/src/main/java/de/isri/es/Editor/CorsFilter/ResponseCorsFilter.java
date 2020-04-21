package de.isri.es.Editor.CorsFilter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class ResponseCorsFilter implements ContainerResponseFilter {

	//Esta clase permite conectar esta API con el front-end creado en Angular
	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext response)
			throws IOException {
		// TODO Auto-generated method stub
		response.getHeaders().add("Access-Control-Allow-Origin", "*");
		response.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, Authorization");
		response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	}

}
