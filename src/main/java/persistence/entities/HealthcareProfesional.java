//package persistence.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity(name = "HealthcareProfesional")
//public class HealthcareProfesional extends Person {
//
//	@Column
//	private String doctor_id;
//
//	@Column(name = "practice_address")
//	@OneToOne
//	private Address personalAddress;
//
//	public String getDoctor_id() {
//		return doctor_id;
//	}
//
//	public void setDoctor_id(String doctor_id) {
//		this.doctor_id = doctor_id;
//	}
//
//	public Address getPersonalAddress() {
//		return personalAddress;
//	}
//
//	public void setPersonalAddress(Address personalAddress) {
//		this.personalAddress = personalAddress;
//	}
//
//}
