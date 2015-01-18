package rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/blacklist-rs/")
public class BlacklistConfiguration extends ResourceConfig {

	public BlacklistConfiguration() {
		packages("rest");
	}

}
