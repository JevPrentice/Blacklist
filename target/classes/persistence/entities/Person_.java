package persistence.entities;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-26T20:35:53.606+0200")
@StaticMetamodel(Person.class)
public class Person_ {
	public static volatile SingularAttribute<Person, UUID> _id_;
	public static volatile SingularAttribute<Person, String> idNumber;
	public static volatile SingularAttribute<Person, String> firstName;
	public static volatile SingularAttribute<Person, String> surname;
	public static volatile SingularAttribute<Person, String> mobileNumber;
}
