package persistence.entities;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-26T19:57:02.346+0200")
@StaticMetamodel(Person.class)
public class Person_ {
	public static volatile SingularAttribute<Person, UUID> id;
	public static volatile SingularAttribute<Person, String> firstName;
	public static volatile SingularAttribute<Person, String> surname;
}
