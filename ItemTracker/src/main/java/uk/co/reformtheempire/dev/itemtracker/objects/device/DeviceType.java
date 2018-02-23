package uk.co.reformtheempire.dev.itemtracker.objects.device;

public class DeviceType {

	private final int id;
	private final String type;
	
	public DeviceType(int id, String type) {
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
		return "DeviceType [id=" + id + ", type=" + type + "]";
	}
	
	
	
}
