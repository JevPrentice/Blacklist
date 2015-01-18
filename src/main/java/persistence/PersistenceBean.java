package persistence;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.json.JsonArray;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Stateless
@LocalBean
public class PersistenceBean {

	@PersistenceContext(name = "Blacklist")
	EntityManager em;

	@Resource
	private DataSource dataStore;

	public PersistenceBean() {
	}

	public JsonArray getAllDoctors() {

		return null;

	}

	public void getDoctor(String name) {

	}

	// public void createDoctor(HealthcareProfesional healthcareProfesional) {
	//
	// }
	//
	// public void updateDoctor(HealthcareProfesional healthcareProfesional) {
	//
	// }

}
