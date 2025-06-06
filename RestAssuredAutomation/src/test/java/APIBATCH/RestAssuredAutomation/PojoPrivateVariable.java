package APIBATCH.RestAssuredAutomation;

public class PojoPrivateVariable {
	private String Firstname;
	private String Lastname;
	private String Designation;
	private String id;
    private PojoComplexJson Address[];
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public PojoComplexJson[] getAddress() {
		return Address;
	}
	public void setAddress(PojoComplexJson[] address) {
		Address = address;
	}
	
}
	