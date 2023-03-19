package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		ReadProperties rp = new ReadProperties();
		rp.readProperties();
	}
	
	public void readProperties() throws IOException {
		File file = new File("./src/filehandling/data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("browser"));
	}
}
