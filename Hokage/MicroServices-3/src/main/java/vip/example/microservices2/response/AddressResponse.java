package vip.example.microservices2.response;

public class AddressResponse {
	private long addId;
	private String city;
	private String state;
	private String pincode;
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
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
