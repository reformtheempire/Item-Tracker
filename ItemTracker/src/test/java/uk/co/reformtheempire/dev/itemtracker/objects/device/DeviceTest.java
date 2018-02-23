package uk.co.reformtheempire.dev.itemtracker.objects.device;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeviceTest {

	@Test
	public void testCreateDevice() {
		System.out.println("testCreateDevice");

		System.out.println("Creating Device Type:");
		
		int deviceTypeID = 0;
		String deviceType = "Test Device";
		DeviceType dt = new DeviceType(deviceTypeID, deviceType);
		
		System.out.println(dt.toString());
		
		System.out.println("Creating Device");
		
		int deviceID = 11;
		String deviceName = "Test-01";
		String deviceSerialNumber = "TESTSERIAL12345";
		
		Device d = new Device(deviceID, dt, deviceName, deviceSerialNumber);
		
		System.out.println(d.toString());
		
		//begin tests
		assertNotNull(d);
		
		assertEquals(deviceTypeID, d.getDeviceType().getId());
		assertEquals(deviceType, d.getDeviceType().getType());
		
		assertEquals(deviceID, d.getId());
		assertEquals(deviceName, d.getDeviceName());
		assertEquals(deviceSerialNumber, d.getSerialNumber());
		
		System.out.println("end of testCreateDevice.");

	}

}