package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return birthDate;
	}

	public void setBithDate(Date bithDate) {
		this.birthDate = bithDate;
	}
	
	public String toString() {
		return getName() + " (" + sdf.format(birthDate) + ") - " + getEmail();
	}
}
