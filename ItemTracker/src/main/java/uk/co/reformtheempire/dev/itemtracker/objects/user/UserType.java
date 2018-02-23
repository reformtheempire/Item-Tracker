package uk.co.reformtheempire.dev.itemtracker.objects.user;

public class UserType {

	private final int id;
	private final String type;
	
	public UserType(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	
	
	@Override
	public String toString() {
		return "UserType [id=" + id + ", type=" + type + "]";
	}
	
	
	
}