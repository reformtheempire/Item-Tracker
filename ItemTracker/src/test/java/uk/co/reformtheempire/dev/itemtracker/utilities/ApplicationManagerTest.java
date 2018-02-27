package uk.co.reformtheempire.dev.itemtracker.utilities;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Test;

public class ApplicationManagerTest {

	@Test
	public void testCreateGetProperties() {
		Properties p = new Properties();
		
		if(!new File("application.properties").exists()) {
			
		
		p.setProperty("database_url", "localhost");
		p.setProperty("database_username", "username");
		p.setProperty("database_password", "password");
		p.setProperty("database_driver", "com.mysql.cj.jdbc.Driver");
		
		try {
			OutputStream out = new FileOutputStream("application.properties");
			p.store(out, "Creating Example Properties File");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.clear();
		
		}
		
		InputStream in;
		
		try {
			in = new  FileInputStream(new File("application.properties"));
			p.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals("localhost", p.get("database_url"));
		assertEquals("username", p.get("database_username"));
		assertEquals("password", p.get("database_password"));
		assertEquals("com.mysql.cj.jdbc.Driver", p.get("database_driver"));
	}

}
