package uk.co.reformtheempire.dev.itemtracker.objects.device;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeviceTypeTest {

	@Test
	public void testCreateDeviceType() {
		System.out.println("testCreateDeviceType");

		System.out.println("Creating Device Type:");
		
		int deviceTypeID = 0;
		String deviceType = "Test Device";
		DeviceType dt = new DeviceType(deviceTypeID, deviceType);
		
		System.out.println(dt.toString());
		
		assertNotNull(dt);
		
		assertEquals(deviceTypeID, dt.getId());
		assertEquals(deviceType, dt.getType());
		
		System.out.println("end of testCreateDeviceType.");
	}

}
