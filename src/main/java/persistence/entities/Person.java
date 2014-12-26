package persistence.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "person")
public class Person {

	@Id
	private UUID _id_;

	@Column(name = "id_number")
	private String idNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "surname")
	private String surname;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "personal_address")
	private Address personalAddress;

	public UUID get_id_() {
		return _id_;
	}

	public void set_id_(UUID _id_) {
		this._id_ = _id_;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getPersonalAddress() {
		return personalAddress;
	}

	public void setPersonalAddress(Address personalAddress) {
		this.personalAddress = personalAddress;
	}

}
