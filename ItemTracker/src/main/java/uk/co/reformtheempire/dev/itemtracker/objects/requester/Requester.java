package uk.co.reformtheempire.dev.itemtracker.objects.requester;

public class Requester {

	private final int id;
	private final String name;
	private final String email;
	private final String telephoneNumber;

	public Requester(int id, String name, String email, String telephoneNumber) {
		super();
		this.id = id;
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
		return "User [id=" + id + ", name=" + name + ", email=" + email
				+ ", telephoneNumber=" + telephoneNumber + "]";
	}

	
	
}
