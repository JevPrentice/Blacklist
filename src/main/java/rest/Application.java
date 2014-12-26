package rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/blacklist-rs/")
public class Application extends ResourceConfig {

	public Application() {
		packages("rest");
	}

}
