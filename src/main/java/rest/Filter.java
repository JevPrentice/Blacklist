package rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class Filter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext containerRequestContext)
			throws IOException {

		System.out.println("Blacklist RS IN");
		System.out.println("Request Path: "
				+ containerRequestContext.getUriInfo().getAbsolutePath()
						.toString());

	}

	@Override
	public void filter(ContainerRequestContext containerRequestContext,
			ContainerResponseContext containerResponseContext)
			throws IOException {

		System.out.println("Blacklist RS OUT");

		if (containerResponseContext.getHeaders().get(
				"Access-Control-Allow-Origin") == null) {
			containerResponseContext.getHeaders().add(
					"Access-Control-Allow-Origin", "*");
		}

		if (containerResponseContext.getHeaders().get(
				"Access-Control-Allow-Methods") == null) {
			containerResponseContext.getHeaders().add(
					"Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		}

	}

}
