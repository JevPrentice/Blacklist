package persistence.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "person")
public class Person {

	@Id
	UUID id;

	@Column(name = "first_name")
	String firstName;

	@Column(name = "surname")
	String surname;
}
