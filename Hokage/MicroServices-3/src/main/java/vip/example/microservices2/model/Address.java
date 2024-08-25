package vip.example.microservices2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "add_generator")
	private long addId;
	private String city;
	private String state;
	private String pincode;
	private int EmpId;
	public long getAddId() {
		return addId;
	}
	public void setAddId(long addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
