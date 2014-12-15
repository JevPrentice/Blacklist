package persistence;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.json.JsonArray;
import javax.sql.DataSource;

@Stateless
@LocalBean
public class PersistenceBean {

	public PersistenceBean() {
	}

	@Resource
	private DataSource dataStore;

	public JsonArray getDoctors() {
		return null;

	}

	public void getDoctor(String name) {

	}

	public void createDoctor() {

	}

	public void updateDoctor() {

	}

}
