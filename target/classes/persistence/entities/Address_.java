package persistence.entities;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-26T20:35:53.603+0200")
@StaticMetamodel(Address.class)
public class Address_ {
	public static volatile SingularAttribute<Address, UUID> _id_;
	public static volatile SingularAttribute<Address, String> street;
	public static volatile SingularAttribute<Address, String> city;
	public static volatile SingularAttribute<Address, String> province;
	public static volatile SingularAttribute<Address, String> zip;
}
