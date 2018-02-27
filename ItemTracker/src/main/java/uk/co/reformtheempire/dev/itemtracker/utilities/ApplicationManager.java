package uk.co.reformtheempire.dev.itemtracker.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {

	public static Properties getApplicationProperties() {
		FileInputStream input;
		try {
			input = new FileInputStream(new File("application.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			input = null;
		}
		Properties p = new Properties();
		try {
			if(input == null) {
				throw new FileNotFoundException();
			}
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
}