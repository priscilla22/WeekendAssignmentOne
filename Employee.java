
class Employee{
	private String firstname, lastname, phoneNumber, emailID;
	

	public Employee(String firstname, String lastname, String phoneNumber, String emailID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getEmailID() {
		return emailID;
	}


	
}
