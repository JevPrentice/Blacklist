package rest;

import javax.ejb.EJB;
import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import persistence.PersistenceBean;

@Path("")
public class Blacklist {

	@EJB
	PersistenceBean db;

	@GET
	@Path("/getDoctors/")
	public Response getDoctors() {
		JsonArray json = null;
		try {

			if (db == null) {
				System.err.println("Unable to connect to ejb");
				return Response.status(Status.INTERNAL_SERVER_ERROR).build();
			}

			json = db.getAllDoctors();

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}

		return Response.ok(json.toString()).build();

	}

}
