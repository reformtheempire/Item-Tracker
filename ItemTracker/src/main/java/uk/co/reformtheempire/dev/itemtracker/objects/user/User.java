package uk.co.reformtheempire.dev.itemtracker.objects.user;

public class User {

	private final int id;
	private final String name;
	private final UserType userType;
	private final String email;
	private final String telephoneNumber;

	public User(int id, UserType userType, String name, String email, String telephoneNumber) {
		super();
		this.id = id;
		this.userType = userType;
		this.name = name;
		this.email = email;
		
		if (telephoneNumber == null || telephoneNumber.isEmpty()) {
			this.telephoneNumber = "";
		} else {
			this.telephoneNumber = telephoneNumber;
		}
		
	}

	public int getId() {
		return id;
	}

	public UserType getUserType() {
		return userType;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userType=" + userType + ", name=" + name + ", email=" + email
				+ ", telephoneNumber=" + telephoneNumber + "]";
	}

	
	
}
