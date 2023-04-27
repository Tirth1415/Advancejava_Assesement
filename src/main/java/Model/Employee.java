package Model;

public class Employee {
	private int ID;
	private String First_Name, Last_Name, Email, Address, Gender, Password;
	private Long Mobile;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Long getMobile() {
		return Mobile;
	}

	public void setMobile(Long mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email
				+ ", Address=" + Address + ", Gender=" + Gender + ", Password=" + Password + ", Mobile=" + Mobile + "]";
	}

}
