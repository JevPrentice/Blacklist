package persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "HealthcareProfesional")
public class HealthcareProfesional extends Person {

	@Column
	String doctor_id;

}
