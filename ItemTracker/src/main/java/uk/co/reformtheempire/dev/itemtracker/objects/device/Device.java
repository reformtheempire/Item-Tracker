package uk.co.reformtheempire.dev.itemtracker.objects.device;

public class Device {

	private final int id;
	private final String deviceName;
	private final DeviceType deviceType;
	private final String serialNumber;
	
	public Device(int id, DeviceType deviceType, String deviceName, String serialNumber) {
		this.id = id;
		this.deviceType = deviceType;
		this.deviceName = deviceName;
		this.serialNumber = serialNumber;
	}

	public int getId() {
		return id;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", deviceType=" + deviceType + ", deviceName=" + deviceName + ", serialNumber="
				+ serialNumber + "]";
	}
	
	
}
